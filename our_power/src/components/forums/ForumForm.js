import React, { useState } from 'react'

const ForumForm = ({onCreate}) => {

    const [stateForum, setStateForum] = useState(
        {
            post:"",
            forum_rating:0
        }
    )

    const handleSubmit = function(event){
        event.preventDefault();
        onCreate(stateForum);
    }

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedForum = {...stateForum};
        copiedForum[propertyName] = event.target.value;
        setStateForum(copiedForum)
    }

    return (
    <div>
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="Comment" name="post" onChange={handleChange} value={stateForum.post}/>
            <input type="number" placeholder="Rating" name="forum_rating" onChange={handleChange} value={stateForum.forum_rating}/>
            <button type="Submit" >Save Comment</button>
        </form>
    </div>
    )
}

export default ForumForm