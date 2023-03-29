import './App.scss';
import CompCardContainer from './components/CompCardContainer/CompCardContainer.jsx'
import SearchBox from './nav/SearchBox';
import { useState,useEffect } from 'react';   
      
function App() {

  const [compsAPI, setCompsAPI] = useState([]);
  const [search, setSearch] = useState("");
  const [buttonState,setButtonState] =useState("")
  useEffect(() => {
    getComps();
  }, [search]); //filetrs becouse we call it again 

  const getComps = async () => {

    let url = "http://localhost:8080/allCompetitions";
  

//  if (search) {
//   url += `?=${search}&`;
// }

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

export default App;
//This code includes a showModal state variable that controls whether the modal is displayed or not. When the "Add Competition" button is clicked, showModal is set to true. This causes the modal to be displayed with input fields for the user to enter the details of the new competition.