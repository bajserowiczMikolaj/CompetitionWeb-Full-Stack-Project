import "./Button.scss";
import React from "react";
import { useNavigate } from "react-router-dom";


const Button = () => {

    const navigate =useNavigate();
  return (
    <div>
<button className="button" onClick={()=>{navigate("/form");}}>Register Competition</button>
    </div>
  );
};

export default Button;