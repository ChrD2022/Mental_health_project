import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';
import ForumForm from '../forums/ForumForm';


const Affirmation = ({ affirmation, forums, handlePost }) => {
  if (!affirmation) {
    return 'Loading...';
  }

  const url = '/affirmations/' + affirmation.id;

  const myStyle = {
    fontFamily: 'Arial, sans-serif',
    backgroundColor: 'white',
    top: 0,
    left: 0,
    right: 0,
    border: '5px solid black',
    height: '80p%',
    display: 'flex',
    alignItems: 'center',
  };


  return (
    <div>
    <Fragment>
    <div className='affirmation-select' style={myStyle}>
      <h1>
        <Link to={url}>
          {affirmation.category.name}
        </Link>
      </h1>
     
      <div>
      <p>
        {affirmation.title} 
      </p>
      </div>
    </div>
    </Fragment>
    </div>
  );
};

export default Affirmation;