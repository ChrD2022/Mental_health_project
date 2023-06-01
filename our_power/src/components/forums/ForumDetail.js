import React from 'react'
import Forum from './Forum'

const ForumDetail = (prop, handleDelete) => {

const onDelete = () => {
    handleDelete(prop.forum.id)
}

    return (

    <div>
        <Forum forum={prop.forum}/>
        <button onClick={onDelete} className='delete-comment'>DELETE</button>
    </div>

    )
}

export default ForumDetail