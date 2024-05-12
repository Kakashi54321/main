import React from 'react'
import Heading from '../Reusable/Heading'

export default function Contact() {
    return (
        <section className="py-3">
            <Heading title="Get in touch with Us"/>
            <div className="col-10 col-sm-8 mx-auto">
                <form action="https://formspree.io/f/xpzkzwgg" method="POST">
                    <div className="form-group">
                        <label htmlFor="name">Your Name:</label>
                        <input type="text" name="name" id="name"
                        placeholder="Your Name" className="form-control"/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="email">Your Email:</label>
                        <input type="text" name="email" id="email"
                        placeholder="Your Email" className="form-control"/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="mobile">Your Phone:</label>
                        <input type="text" name="mobile" id="mobile"
                        placeholder="Your Phone" className="form-control"/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="message">Your Query:</label>
                        <textarea type="text" name="description" id="description"
                        placeholder="Your message" className="form-control"/>
                    </div>
                    <button type="Submit" className="btn btn-block btn-success text-white">Submit</button>
                </form>
            </div>
        </section>
    )
}
