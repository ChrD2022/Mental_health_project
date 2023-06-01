import React from 'react';
import Affirmation from './Affirmation';
import ForumForm from '../forums/ForumForm';

const AffirmationDetail = ({affirmation, forums, handleDelete, handleForumPost}) => {

    if(affirmation){
      
      const affirmationsForums = affirmation.forums.map((forum, index) => {
            return <li key={index}>{forum.post}</li>
        })

        const onDelete = () => {
          handleDelete(affirmation.id)
        }


        

  return (
    <div className='component'>
        <Affirmation affirmation={affirmation}/>
        <p>Comments:</p>
        <ul>
            {affirmationsForums}
        </ul>

        <button className='delete-button-comments' onClick={onDelete}>DELETE </button>
    </div>
  )
}

return(
    <p>Loading...</p>
)

}

export default AffirmationDetail;