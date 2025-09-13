import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Navbar from './page/dashboard/patient/navbar'
import Therapy from './page/dashboard/patient/therapy'
import Past from './page/dashboard/patient/therapy2'
function App() {

  return (  
    <>
    <Navbar/>
    <Past/>
    </>
  )
}

export default App
