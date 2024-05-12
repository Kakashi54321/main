import React from 'react'
import Heading from './Heading'
import {Link} from 'gatsby'

export default function DualInfoBlock({heading, subHeading, img}) {
    return (
        <section className="my-4 py-4 bg-theme">
            <div className="container">
                <Heading title={heading}/>
                <div className="row">
                    <div className="col-sm-8 mx-auto">
                        <p className="lead text-white mb-5">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. In massa tempor nec feugiat nisl pretium fusce id. Magna fringilla urna porttitor rhoncus dolor purus non enim. Laoreet id donec ultrices tincidunt arcu non sodales neque. Ut enim blandit volutpat maecenas volutpat blandit aliquam. Fusce id velit ut tortor pretium viverra suspendisse. Eu feugiat pretium nibh ipsum consequat nisl. Id leo in vitae turpis massa sed elementum tempus egestas. Vitae congue mauris rhoncus aenean vel elit scelerisque mauris. Molestie a iaculis at erat. Aliquam nulla facilisi cras fermentum odio eu. Nec sagittis aliquam malesuada bibendum arcu vitae. Dolor magna eget est lorem ipsum dolor sit amet. Dis parturient montes nascetur ridiculus mus mauris. Tempus urna et pharetra pharetra. Egestas integer eget aliquet nibh praesent tristique magna sit amet. Varius morbi enim nunc faucibus a pellentesque sit amet porttitor.
                        </p>
                    </div>
                    <div className="col-sm-4">
                        <div className="card bg-dark"  >
                            <img src={img} className="card-img-top" alt="image"/>
                            <div className="card-body">
                                <h5 className="card-title text-success">{subHeading}</h5>
                                <p className="card-text text-white">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. In est ante in nibh mauris.
                                </p>
                                <Link to="/about" className="btn btn-warning btn-block">
                                        {heading} 
                                </Link>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    )
}
