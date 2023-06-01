import React from 'react';
import Affirmation from './Affirmation.js';
import Slider from 'react-slick';
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";


const AffirmationList = ({affirmations}) => {

    if (affirmations.length ===0){
        return (<p>Loading...</p>)
    }

    // const affirmationElements = affirmations.map((affirmation, index) => {
    //     return (
    //         <li key={index} className='component-item'>
    //         <div className="component">
    //             <Affirmation affirmation={affirmation}/>
    //         </div>

    //         </li>
    //     )
      
    // })

    const affirmationElements = affirmations.map((affirmation, index) => {
        return (
            <div key = {index}>
                <Affirmation affirmation={affirmation}/>
            </div>
        )
      
    })

    const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1
      };


	return (
        
            <div>
              <Slider {...settings}>
                {affirmationElements}
              </Slider>
            </div>
          );

}
 export default AffirmationList;