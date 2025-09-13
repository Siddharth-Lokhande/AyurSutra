import React, { useState } from 'react';

const Navbar = () => {
  const [activeLink, setActiveLink] = useState('firstLink');

  const handleLinkClick = (linkName) => {
    setActiveLink(linkName);
  };
  return (
    <header className="text-white bg-black body-font">
      <div className="container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center">
        <a className="flex title-font font-medium items-center text-white mb-4 md:mb-0">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" className="w-10 h-10 text-white p-2 bg-indigo-500 rounded-full" viewBox="0 0 24 24">
            <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
          </svg>
          <span className="ml-3 text-xl">Dashboard</span>
        </a>
        <nav className="md:ml-auto md:mr-auto flex flex-wrap items-center text-base justify-center space-x-8">
          <a
            onClick={() => handleLinkClick('firstLink')}
            className={`p-2 rounded-lg cursor-pointer ${activeLink === 'firstLink' ? 'bg-gray-200 text-black' : 'hover:text-gray-400'}`}
          >
            First Link
          </a>
          <a
            onClick={() => handleLinkClick('secondLink')}
            className={`p-2 rounded-lg cursor-pointer ${activeLink === 'secondLink' ? 'bg-gray-200 text-black' : 'hover:text-gray-400'}`}
          >
            Second Link
          </a>
          <a
            onClick={() => handleLinkClick('thirdLink')}
            className={`p-2 rounded-lg cursor-pointer ${activeLink === 'thirdLink' ? 'bg-gray-200 text-black' : 'hover:text-gray-400'}`}
          >
            Third Link
          </a>
          <a
            onClick={() => handleLinkClick('fourthLink')}
            className={`p-2 rounded-lg cursor-pointer ${activeLink === 'fourthLink' ? 'bg-gray-200 text-black' : 'hover:text-gray-400'}`}
          >
            Fourth Link
          </a>
        </nav>
        <div className="relative flex items-center md:-ml-8">
          <input
            type="text"
            placeholder="search"
            className="rounded-full pl-4 pr-10 py-1 bg-white text-black focus:outline-none"
          />
          <svg className="w-4 h-4 text-gray-500 absolute right-3" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
            <circle cx="11" cy="11" r="8"></circle>
            <path d="M21 21l-4.35-4.35"></path>
          </svg>
        </div>
        <button style={{ backgroundColor: 'white', color: 'black' }} className="inline-flex items-center border-0 py-1 px-3 focus:outline-none hover:bg-gray-200 rounded text-base mt-4 md:mt-0 ml-8">Profile
        </button>
      </div>
    </header>
  );
};
export default Navbar;
