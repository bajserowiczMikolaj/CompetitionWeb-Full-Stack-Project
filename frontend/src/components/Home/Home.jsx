import './Home.scss';

import CompCardContainer from '../CompCardContainer/CompCardContainer.jsx';
import SearchBox from '../../nav/SearchBox';
import { useState,useEffect } from 'react';  

      
const Home=() => {

  const [compsAPI, setCompsAPI] = useState([]);
  const [search, setSearch] = useState("");
  const [buttonState,setButtonState] =useState("")
  useEffect(() => {
    getComps();
  }, [search]); //filetrs becouse we call it again 

  const getComps = async () => {

    let url = "http://localhost:8080/competitions";
  

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