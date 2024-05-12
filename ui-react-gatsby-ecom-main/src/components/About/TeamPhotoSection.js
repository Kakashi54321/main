import React from 'react'
import Heading from '../Reusable/Heading';
import team1 from '../../images/rashmi.jpg';
import team2 from '../../images/dilip.jpg';
import team3 from '../../images/diwas.jpg';

export default function TeamPhotoSection({heading}) {
    return (
        <div className="row">
            <div className="col-10 col-sm-10 mx-auto">
            <Heading title={heading}/>
            <div className="card-group">
            <div className="card">
                <img src={team1} className="card-img-top" alt="..."/>
                <div className="card-body">
                <h5 className="card-title">Rashmi Prasad</h5>
                <p className="card-text">Chief Financial Officer@LearnCode</p>
                </div>
            </div>
            <div className="card">
                <img src={team2} className="card-img-top" alt="..."/>
                <div className="card-body">
                <h5 className="card-title">Dilip Kumar</h5>
                <p className="card-text">Chief Executive Officer@LearnCode</p>
                </div>
            </div>
            <div className="card">
                <img src={team3} className="card-img-top" alt="..."/>
                <div className="card-body">
                <h5 className="card-title">Diwas Sedai</h5>
                <p className="card-text">Chief Technical Officer@LearnCode</p>
                </div>
            </div>
            </div>
            </div>
        </div>
    )
}
