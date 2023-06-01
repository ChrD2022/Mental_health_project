import React, { Component, Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Switch, Routes, useParams } from "react-router-dom";
import Request from '../helpers/request';
import ForumList from '../components/forums/ForumList'
import ForumForm from '../components/forums/ForumForm';
import ForumDetail from '../components/forums/ForumDetail';

const ForumContainer = () => {

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

    const getForums = () => {
        const request = new Request()
        request.get("/api/forums")
        .then((data) => {
            setForums(data)
        })
    }

    const findForumById = (id) => {
        return forums.find((forum) => {
            return forum.id === parseInt(id);
        })
    }

    const handlePost = (forum) => {
        const request = new Request();
        request.post('/api/forums/', forum).then(() => {
        window.location = '/forums'
        })
    }

    const handleDelete = (id) => {
        const request = new Request();
        const url = '/api/forums/' + id
        request.delete(url).then(() => {
            window.location = '/forums'
        })
    }

    const ForumDetailWrapper = () => {
        const { id } = useParams();
        let foundForum = findForumById(id)
        return <ForumDetail forum={foundForum} handleDelete={handleDelete} />
    }

    return (
    <div>

        <Routes>
            <Route path="/" element={
                <ForumList forums={forums} handlePost={handlePost}/>
            }/>
            <Route path="/:id" element={
                <ForumDetailWrapper/>
            } />
        </Routes>

    </div>
    )
}

export default ForumContainer