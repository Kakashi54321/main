import * as React from "react"
import { graphql } from 'gatsby'

import Layout from "../components/layout"
import SEO from "../components/seo"
import HeroSection from '../components/Reusable/HeroSection'
import InfoBlock from '../components/Reusable/InfoBlock'
import DualInfoBlock from '../components/Reusable/DualInfoBlock'
import CourseCart from '../components/Cart/CourseCart'
import BundleCart from '../components/Cart/BundleCart'

const IndexPage = ({ data }) => (
  <Layout>
    <SEO title="Home" />
    <HeroSection
    img={data.img.childImageSharp.fluid}
    title="I WRITE CODE"
    subtitle="LearnCode.in"
    heroclass="hero-background"
    />
    <InfoBlock heading="About Us"/>
    <CourseCart courses={data.courses}/>
    <DualInfoBlock 
    heading="Just click photos"
    subHeading="Just click photos"
    img="https://images.pexels.com/photos/569836/pexels-photo-569836.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
    />
    <BundleCart bundles={data.bundles}/>
  </Layout>
)

export const query = graphql`
{
  img: file(relativePath: { eq: "heromain.png" }) {
    childImageSharp {
      fluid {
      ...GatsbyImageSharpFluid_tracedSVG
      }
    }
  }

  courses:allContentfulCourses{
		edges{
			node{
				id
        title
        category
        price
        description{
					description
        }
        image{
					fixed(width:200,height:120){
						...GatsbyContentfulFixed_tracedSVG
          }
        }
      }
    }
  }

  bundles:allContentfulBundles{
		edges{
			node{
				id
        title
        price
        image{
					fixed(width:200,height:120){
						...GatsbyContentfulFixed_tracedSVG
          }
        }
      }
    }
  }
}
`

export default IndexPage
