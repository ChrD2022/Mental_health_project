import React, { Component, Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Switch, Routes, useParams } from "react-router-dom";
import AffirmationList from '../components/affirmations/AffirmationList';
import AffirmationDetail from '../components/affirmations/AffirmationDetail';
import AffirmationForm from '../components/affirmations/AffirmationForm';
import Request from '../helpers/request.js';
import ForumForm from '../components/forums/ForumForm';


const AffirmationContainer = () => {

    const [affirmations, setAffirmations] = useState([])
    const [categories, setCategories] = useState([])
    const [forums, setForums] = useState([])

    useEffect(() => {
        const request = new Request();

        const affirmationPromise = request.get('/api/affirmations');
        const categoryPromise = request.get('/api/categories');
        const forumPromise = request.get('/api/forums');
        
        Promise.all([affirmationPromise, categoryPromise, forumPromise])
        .then((data) => {
          setAffirmations(data[0])
          setCategories(data[1])
          setForums(data[2])
        })
    }, [])
      
    

    const getAffirmations = () => {
      const request = new Request()
      request.get("/api/affirmations")
      .then((data) => {
        setAffirmations(data)
      })
    }

    const findAffirmationById = (id) => {
      return affirmations.find((affirmation) => {
        return affirmation.id === parseInt(id);
      })
    }

    const AffirmationDetailWrapper = () => {
      const { id } = useParams();
      let foundAffirmation = findAffirmationById(id)
      return <AffirmationDetail affirmation={foundAffirmation} handleDelete={handleDelete} />
    };

    const handleDelete = (id) => {
        const request = new Request();
        const url = '/api/affirmations/' + id;
        request.delete(url).then(()=> {
            window.location = '/affirmations';
        })
      
    }

    const handlePost = (affirmation) => {
        const request = new Request();
        request.post('/api/affirmations/', affirmation).then(() => {
          window.location = '/affirmations'
        })
    }



    return(
        <div>
            <Routes>
                <Route path="/new" element={
                  <AffirmationForm affirmations={affirmations} onCreate={handlePost}/>
                }/>
                <Route path="/:id" element={
                    <AffirmationDetailWrapper/>
                }/>
                <Route path="/" element={<AffirmationList affirmations={affirmations} categories={categories} forums={forums} handlePost={handlePost}/>}/>
            </Routes>
        </div>
    )
}


export default AffirmationContainer;