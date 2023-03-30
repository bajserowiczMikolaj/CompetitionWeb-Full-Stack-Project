import React from 'react'
import Button from '../components/Button/Button'
import "./SearchBox.scss"

const SearchBox = ({handleSearch,}) => {
  return (
    <div className='search-box'>

<label className='input'value=" ">
        Search: <input onInput={handleSearch} type="text"
         id="searchbar"
        placeholder="" />
      </label>
  <Button />
    </div>
  )
}

export default SearchBox