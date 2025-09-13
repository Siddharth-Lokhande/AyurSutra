import React, { useState } from 'react';
import St_header from './st_header';
import St_home from './st_home';
import Signup from '../authentication/signup';
import Footer from '../../components/footer';
import Slideshow from './home/slideshow';
import Blog from './home/blog';
import Content1 from './home/content1';
import St_aboutus from './st_aboutus';
import St_contactus from './st_contactus';
import Login from '../authentication/Login'; // Make sure this import exists

function Start() {
  const [page, setPage] = useState('home');
  const handleNavClick = (nav) => setPage(nav);
  const handleLoginClick = () => setPage('login');

  return ( 
    <>
      <St_header onNavClick={handleNavClick}/>
      {page === 'home' && (
        <>
          <div style={{ marginTop: "8px", marginBottom: "8px" }}>
            <Slideshow/>
          </div>
          <Blog/> 
          <Content1 />
        </>
      )}
      {page === 'about' && (
        <St_aboutus />
      )}
      {page === 'signup' && (
        <Signup onLoginClick={handleLoginClick} />
      )}
      {page === 'login' && (
        <Login />
      )}
      <Footer/>
    </>
  );
}

export default Start; // <-- Default export