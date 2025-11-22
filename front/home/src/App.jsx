import { useState } from 'react'
import './App.css'
import Home from './Home'

function App() {

  return (
    <>
      <nav>
        <Link to="/">HOME</Link>
      </nav>
      <Home/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
      </Routes>
    </>
  )
}

export default App
