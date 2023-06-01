import React from 'react';
import Forum from './Forum.js';
import ForumForm from './ForumForm.js';


const ForumList = (props, handlePost) => {

	if(props.forums.length ===0){
		return (<p>Loading...</p>)
	}

	const forumsElements = props.forums.map((forum) => {
			return (<li key={forum.id} className="component-item">
				<Forum forum={forum} />
			</li>
		)
		})

	return (
		<ul className="component-list">
			{forumsElements}
			<br/><ForumForm forums={props.forums} onCreate={handlePost}/>
		</ul>

	)
}
	export default ForumList;