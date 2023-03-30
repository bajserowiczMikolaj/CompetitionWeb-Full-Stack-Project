// import './App.scss';
// import CreateCompetition from './components/CreateCompetition/CreateCompetition';
// import CompCardContainer from './components/CompCardContainer/CompCardContainer.jsx'
// import SearchBox from './nav/SearchBox';
// import { useState,useEffect } from 'react';  
// import { BrowserRouter as Router, Routes, Route } from "react-router-dom"; 
      
// function App() {

//   const [compsAPI, setCompsAPI] = useState([]);
//   const [search, setSearch] = useState("");
//   const [buttonState,setButtonState] =useState("")
//   useEffect(() => {
//     getComps();
//   }, [search]); //filetrs becouse we call it again 

//   const getComps = async () => {

//     let url = "http://localhost:8080/allCompetitions";
  

//  if (search) {
//   url += `?=${search}&`;
// }

// const res = await fetch(url); 
// let data = await res.json(); 
// setCompsAPI(data)

//   };
// const handleSearch = (event) =>{
//   setSearch(event.target.value.toLowerCase());
// }
// const handleClick =(event)=>{
//   setButtonState(event.target.value) 
// }

//   return (
//     <div className="App">
//       <SearchBox
//       handleSearch={handleSearch}
//      onClick={handleClick}
//       />
//      <CompCardContainer comps={compsAPI} />

//      {/* <Router>
//       <Routes>

//         <Route path="/greeting/create" element={<CreateCompetition />} />

//       </Routes>

//      </Router> */}

//     </div>
//   );
// }

// export default App;


//This code includes a showModal state variable that controls whether the modal is displayed or not. When the "Add Competition" button is clicked, showModal is set to true. This causes the modal to be displayed with input fields for the user to enter the details of the new competition.

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