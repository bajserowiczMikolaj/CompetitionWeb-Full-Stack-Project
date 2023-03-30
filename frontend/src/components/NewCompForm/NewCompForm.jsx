import { useState } from "react";
import "./NewCompForm.scss";


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
          placeholder="place URL to comps Img"
          value={comps.createdBy}
          onInput={event => setcomps({ ...comps, imgURL: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="Comps name"
          value={comps.greeting}
          onInput={event => setcomps({ ...comps, compName: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="Location"
          value={comps.originCountry}
          onInput={event => setcomps({ ...comps, location: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="Date"
          value={comps.nationality}
          onInput={event => setcomps({ ...comps, date: event.target.value })}
         /> 
         <input
          className="form-container__input"
          type="text"
          placeholder="Registry Dedline"
          value={comps.originCountry}
          onInput={event => setcomps({ ...comps, registryDedline: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="Fee in £"
          value={comps.nationality}
          onInput={event => setcomps({ ...comps, fee: event.target.value })}
        />
        <input
          className="form-container__input"
          type="text"
          placeholder="Competitors Limit"
          value={comps.nationality}
          onInput={event => setcomps({ ...comps, competitiorsLimit: event.target.value })}
        />
         <input
          className="form-container__input"
          type="text"
          placeholder="Requare Points to Qualify: true or false"
          value={comps.nationality}
          onInput={event => setcomps({ ...comps, requireQualify: event.target.value })}
        />
        
        <button type="submit" className="form-container__button">
          Submit
        </button>
      </form>
    </div>
  );
};

export default NewCompetitionForm;
