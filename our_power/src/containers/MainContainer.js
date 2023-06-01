import React, {Fragment, useEffect, useState} from 'react';
import { BrowserRouter as Router, Route, Routes, useParams, Switch } from "react-router-dom";
import NavBar from '../NavBar.js';
import AffirmationContainer from './AffirmationContainer.js';
import CategoryContainer from './CategoryContainer.js';
import ForumContainer from './ForumContainer.js';



const MainContainer = () => {

  return (

    <div>
        <NavBar/>
            <Routes>
                <Route path="/affirmations/*" element={<AffirmationContainer/>}/>
                <Route path="/categories/*" element={<CategoryContainer/>}/>
                <Route path="/forums/*" element={<ForumContainer/>}/>
            </Routes>
    </div>

  )
}

export default MainContainer;