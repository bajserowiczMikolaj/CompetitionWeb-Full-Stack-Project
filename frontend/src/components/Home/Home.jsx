import './Home.scss';
import CreateCompetition from '../CreateCompetition/CreateCompetition.jsx';
import CompCardContainer from '../CompCardContainer/CompCardContainer.jsx';
import SearchBox from '../../nav/SearchBox';
import { useState,useEffect } from 'react';  
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"; 
      
const Home=() => {

  const [compsAPI, setCompsAPI] = useState([]);
  const [search, setSearch] = useState("");
  const [buttonState,setButtonState] =useState("")
  useEffect(() => {
    getComps();
  }, [search]); //filetrs becouse we call it again 

  const getComps = async () => {

    let url = "http://localhost:8080/allCompetitions";
  

 if (search) {
  url += `?=${search}&`;
}

const res = await fetch(url); 
let data = await res.json(); 
setCompsAPI(data)

  };
const handleSearch = (event) =>{
  setSearch(event.target.value.toLowerCase());
}
const handleClick =(event)=>{
  setButtonState(event.target.value) 
}

  return (
    <div className="App">
      <SearchBox
      handleSearch={handleSearch}
     onClick={handleClick}
      />
     <CompCardContainer comps={compsAPI} />
    </div>
  );
}

export default Home;