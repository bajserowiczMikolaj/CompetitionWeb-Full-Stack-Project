import React from 'react'
import "./CompCard.scss"

const CompCard = (props) => {
    const {id,compName,imgURL ,location,date,registryDedline,fee} = props;
  return (
    <div className='comp-card'>
        <h1 className='comp-card__image'><img src={compName} alt=''></img></h1>
        <h2 className='comp-card__name'>{imgURL}</h2>
        <h3 className='comp-card__description'>Location:{location}</h3>
        <h4 className='comp-card__date'>Date :{date}</h4>
        <h5 className='comp-card__abv'>registryDedline:{registryDedline}</h5>
        <h6 className='comp-card__ph'>fee:{fee}</h6>
    </div>
  )
} 
export default CompCard

