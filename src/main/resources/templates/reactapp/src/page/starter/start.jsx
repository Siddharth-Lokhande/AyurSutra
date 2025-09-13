import React from 'react';
import St_header from './st_header';
import St_home from './st_home';
import Signup from '../signup';
import Footer from '../../components/footer';
import Slideshow from './home/slideshow';
import Blog from './home/blog';
import Content1 from './home/content1';
function Start() {
  return ( 
    <>
      <St_header/>
      <div style={{ marginTop: "8px", marginBottom: "8px" }}>
        <Slideshow/>
      </div>
      <Blog/> 
      <Content1 />
      <Footer/>
    </>
  );
}

export default Start; // <-- Default export