import React, { Component, Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Switch, Routes, useParams } from "react-router-dom";
import Request from '../helpers/request';
import CategoryList from '../components/categories/CategoryList';
import CategoryDetail from '../components/categories/CategoryDetail';
import CategoryForm from '../components/categories/CategoryForm';

const CategoryContainer = () => {

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

    const getCategories = () => {
        const request = new Request()
        request.get("/api/categories")
        .then((data) => {
            setCategories(data)
        })
    }

    const findCategoriesById = (id) => {
        return categories.find((category) => {
            return category.id === parseInt(id);
        })
    }

    const CategoryDetailWrapper = () => {
        const { id } = useParams();
        let foundCategory = findCategoriesById(id)
        return <CategoryDetail category={foundCategory} handleDelete={handleDelete} affirmations={affirmations}/>
    }

    const handlePost = (category) => {
        const request = new Request();
        request.post('/api/categories', category).then(() => {
            window.location = '/categories'
        })
    }

    const handleDelete = (id) => {
        const request = new Request();
        const url = '/api/categories/' + id;
        request.delete(url).then(() => {
            window.location = '/categories'
        })
    }

    return (
    <div>
        <Routes>
            <Route path="/" element={
                <CategoryList categories={categories} handlePost={handlePost}/>
            }/>
            <Route path="/:id" element={
                <CategoryDetailWrapper/>
            }/>
        </Routes>
    </div>
    )
}

export default CategoryContainer