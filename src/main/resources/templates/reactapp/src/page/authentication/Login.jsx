import React, { useState } from 'react';

function Login({ onLoginClick }) {
  const [email, setEmail] = useState("");
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [isDoctor, setIsDoctor] = useState(false);
  const [message, setMessage] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    const payload = {
      userid: 1,
      email: email,
      username: username,
      password: password,
      isdocter: isDoctor,
    };

    try {
      const response = await fetch("http://172.16.18.52:8080/signup", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(payload),
      });

      const data = await response.json();

      if (data.verification === true) {
        setMessage("user added successfully");
      } else {
        setMessage("verification failed");
      }
    } catch (error) {
      setMessage("error: " + error.message);
    }
  };

  return (
    <section className="body-font bg-black text-white">
      <div className="container px-5 py-24 mx-auto flex flex-wrap items-center">
        <div className="lg:w-3/5 md:w-1/2 md:pr-16 lg:pr-0 pr-0">
          <h1 className="title-font font-medium text-3xl text-white">
            Ayurveda Panchakarma: Holistic Healing & Detox
          </h1>
          <p className="leading-relaxed mt-4 text-white">
            Experience the transformative power of Panchakarma, Ayurveda’s
            signature detox and rejuvenation therapy. Login to begin your
            wellness journey!
          </p>
        </div>
        <form
          className="lg:w-2/6 md:w-1/2 bg-gray-900 rounded-lg p-8 flex flex-col md:ml-auto w-full mt-10 md:mt-0"
          onSubmit={handleSubmit}
        >
          <h2 className="text-white text-lg font-medium title-font mb-5">
            Login
          </h2>
          <div className="relative mb-4">
            <label htmlFor="email" className="leading-7 text-sm text-white">
              Email
            </label>
            <input
              type="email"
              id="email"
              name="email"
              className="w-full bg-black border border-gray-300 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-200 text-base outline-none text-white py-1 px-3 leading-8 transition-colors duration-200 ease-in-out rounded"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              required
            />
          </div>
          <div className="relative mb-4">
            <label htmlFor="username" className="leading-7 text-sm text-white">
              Username
            </label>
            <input
              type="text"
              id="username"
              name="username"
              className="w-full bg-black border border-gray-300 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-200 text-base outline-none text-white py-1 px-3 leading-8 transition-colors duration-200 ease-in-out rounded"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              required
            />
          </div>
          <div className="relative mb-4">
            <label htmlFor="password" className="leading-7 text-sm text-white">
              Password
            </label>
            <input
              type="password"
              id="password"
              name="password"
              className="w-full bg-black border border-gray-300 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-200 text-base outline-none text-white py-1 px-3 leading-8 transition-colors duration-200 ease-in-out rounded"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
            />
          </div>
          <div className="flex items-center mb-4">
            <input
              type="checkbox"
              id="isdoctor"
              checked={isDoctor}
              onChange={(e) => setIsDoctor(e.target.checked)}
              className="mr-2"
            />
            <label htmlFor="isdoctor" className="text-sm text-white">
              Is Doctor
            </label>
          </div>
          <button
            type="submit"
            className="text-white bg-indigo-500 border-0 py-2 px-8 focus:outline-none hover:bg-indigo-600 rounded text-lg"
          >
            Login
          </button>
        </form>
      </div>
    </section>
  );
}

export default Login; // <-- Default export