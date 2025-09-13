import React from 'react';

function Login() {
  const handleClick = () => {
        alert("This is a native browser alert!");
      };
  return  <button onClick={handleClick}>Show Native Alert</button>;;
}

export default Login; // <-- Default export