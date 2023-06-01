import React, {Fragment} from 'react';
import { Link } from 'react-router-dom';

const Forum = (prop) => {

  const myStyle = {
    fontFamily: 'Arial, sans-serif',
    backgroundColor: 'white',
    top: 0,
    left: 0,
    right: 0,
    border: '5px solid black',
    height: '80p%',
    display: 'flex',
    alignItems: 'center'
  };
  
  if (!prop.forum){
    return <p>Loading...</p>
  }

  const url = "/forums/" + prop.forum.id

  return (
    <Fragment>
    <Link to={url} className='name'>
    <div style={myStyle}>
      <div className="component">
          <p className="name">
            {prop.forum.post}
          </p>
        <p>Rating: {prop.forum.forum_rating}</p>
      </div>
    </div>
    </Link>
    </Fragment>
  )
}

export default Forum;