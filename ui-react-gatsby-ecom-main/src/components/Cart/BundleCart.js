import React, { Component } from 'react'
import Heading from '../Reusable/Heading'
import Img from "gatsby-image"

export default class BundleCart extends Component {
    constructor(props){
        super(props)
        this.state={
            bundles: props.bundles.edges,
            mybundles: props.bundles.edges,
        } 
    }
    render() {
        return (
            <section className="my-4 py-4">
                <div className="container">
                    <Heading title="Special Bundles"/>
                    <div className="row">
                        {this.state.mybundles.map(({node}) => {
                            return(
                                <div key={node.id} className="col-2.8 mx-auto">
                                   <div className="card" >
                                       <Img fixed={node.image.fixed}/> 
                                       <div className="card-body">
                                            <h5 className="card-title text-center">{node.title}</h5>
                                            <h5 className="card-title text-center">${node.price}</h5>
                                            <button 
                                                data-item-id={node.id}
                                                data-item-name={node.title}
                                                data-item-price={node.price}
                                                data-item-url="https://dilip-ecom.netlify.app/"
                                                data-item-image={node.image.fixed.src}
                                                className="btn btn-warning btn-block snipcart-add-item">Buy Now
                                            </button>
                                       </div>
                                   </div>                
                               </div>
                            )
                        })}
                </div>
            </div>
        </section>
        )
    }
}
