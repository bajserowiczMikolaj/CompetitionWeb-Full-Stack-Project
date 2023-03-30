
import './App.scss';
import CreateCompetition from './components/CreateCompetition/CreateCompetition';
import CompCardContainer from './components/CompCardContainer/CompCardContainer.jsx'
import Home from './components/Home/Home';
import SearchBox from './nav/SearchBox';
import { useState,useEffect } from 'react';  
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"; 
import NewCompetitionForm from './components/NewCompForm/NewCompForm';
      
function App() {

  
  return (
    <div className="App">
     <Router>
      <Routes>
        <Route path="/" element={<Home />}/>
        <Route path="/form" element={<CreateCompetition />}/>
      </Routes>
     </Router>
    </div>
  );
}

export default App;