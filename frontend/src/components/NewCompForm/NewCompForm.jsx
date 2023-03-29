import { useState } from "react";
import "./NewCompForm.scss";

/* 
  Form styles borrowed from: 
  https://codepen.io/banunn/pen/AFnal
*/

const NewCompetitionForm = ({ defaultFormState, handleSubmit, formTitle }) => {
  const [comps, setcomps] = useState(defaultFormState);

  const handleValidation = event => {
    event.preventDefault();

    if (Object.values(comps).some(value => !value)) {
      alert("Missing content, unable to proceed");
      return;
    }

    handleSubmit(comps);
  };

  return (
    <div className="form-container">
      <h2 className="form-container__title">{formTitle}</h2>
      <form className="form-container__form" onSubmit={handleValidation}>
        <input
          className="form-container__input"
          type="text"
          placeholder="your name"
          value={comps.createdBy}
          onInput={event => setcomps({ ...comps, createdBy: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="greeting"
          value={comps.greeting}
          onInput={event => setcomps({ ...comps, greeting: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="origin country"
          value={comps.originCountry}
          onInput={event => setcomps({ ...comps, originCountry: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="nationality"
          value={comps.nationality}
          onInput={event => setcomps({ ...comps, nationality: event.target.value })}
        />
        <button type="submit" className="form-container__button">
          Submit
        </button>
      </form>
    </div>
  );
};

export default NewCompetitionForm;
