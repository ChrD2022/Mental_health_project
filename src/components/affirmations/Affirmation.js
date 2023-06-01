import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';
import Surf from  '../../resources/background.jpg';
import Beach2 from '../../resources/nice_water.jpg';
import Waterfall from '../../resources/waterfall.jpg';


const Affirmation = ({ affirmation }) => {
  if (!affirmation) {
    return 'Loading...';
  }

  const url = '/affirmations/' + affirmation.id;

  const images = [
    {
      id: 1,
      src: Surf,
    },
    {
      id: 2,
      src: Beach2,
    },
    {
      id: 3,
      src: Waterfall,
    },
  ];

  const selectedImage = images.find((img) => img.id === affirmation.category.id);

  return (
    <Fragment>
      <h1>
        <Link to={url} className='name'>
          Category: {affirmation.category.name}
        </Link>
      </h1>
      <p>
        Affirmation: {affirmation.title}
      </p>
      <img src={selectedImage ? selectedImage.src : Surf} alt='Background' />
    </Fragment>
  );
};

export default Affirmation;
