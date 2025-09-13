import React, { useState } from 'react';

const Profile = () => {
  const [formData, setFormData] = useState({
    fullName: '',
    address: '',
    pincode: '',
    mobileNo: '',
    gender: 'male',
    height: '',
    weight: '',
    bloodGroup: '',
    profilePhoto: null,
  });

  const [uploadMessage, setUploadMessage] = useState('');
  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleFileChange = (e) => {
    const file = e.target.files[0];
    if (file) {
      setFormData((prevData) => ({
        ...prevData,
        profilePhoto: URL.createObjectURL(file),
      }));
    }
  };

  const handleGenderToggle = (gender) => {
    setFormData((prevData) => ({
      ...prevData,
      gender,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    setUploadMessage('Submitting form...');

    const payload = new FormData();
    for (const key in formData) {
      payload.append(key, formData[key]);
    }

    try {
      const response = await fetch('http://localhost:8080/pform', {
        method: 'POST',
        body: payload,
      });

      if (response.ok) {
        setUploadMessage('Form submitted successfully!');
        console.log('Form data sent:', formData);
      } else {
        setUploadMessage(`Error: ${response.statusText}`);
        console.error('Failed to submit form.');
      }
    } catch (error) {
      setUploadMessage(`Error: Could not connect to the server.`);
      console.error('Submission failed:', error);
    } finally {
      setLoading(false);
    }
  };

  return (
    <section className="min-h-screen flex items-center justify-center bg-yellow-900 text-white p-4">
      <div className="bg-yellow-800 rounded-2xl shadow-2xl p-8 max-w-2xl w-full">
        <h2 className="text-3xl font-bold text-center mb-8">User Profile</h2>
        <form onSubmit={handleSubmit} className="space-y-6">

          {/* Profile Photo */}
          <div className="flex flex-col items-center">
            <div className="w-32 h-32 rounded-full overflow-hidden border-4 border-yellow-500 mb-4">
              <img
                src={formData.profilePhoto || 'https://placehold.co/128x128/fcd34d/000000?text=Profile'}
                alt="Profile"
                className="w-full h-full object-cover"
              />
            </div>
            <label className="cursor-pointer bg-yellow-500 text-black py-2 px-6 rounded-full font-bold shadow-md hover:bg-yellow-400 transition-colors duration-200">
              Upload Image
              <input type="file" onChange={handleFileChange} className="hidden" />
            </label>
          </div>

          {/* Full Name & Address */}
          <div>
            <label htmlFor="fullName" className="block text-sm font-medium mb-1">Full Name</label>
            <input
              type="text"
              id="fullName"
              name="fullName"
              value={formData.fullName}
              onChange={handleChange}
              placeholder="Your Full Name"
              className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
              required
            />
          </div>
          <div>
            <label htmlFor="address" className="block text-sm font-medium mb-1">Address</label>
            <input
              type="text"
              id="address"
              name="address"
              value={formData.address}
              onChange={handleChange}
              placeholder="Your Address"
              className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
              required
            />
          </div>

          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            {/* Pincode & Mobile No */}
            <div>
              <label htmlFor="pincode" className="block text-sm font-medium mb-1">Pincode</label>
              <input
                type="number"
                id="pincode"
                name="pincode"
                value={formData.pincode}
                onChange={handleChange}
                placeholder="000000"
                className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
                required
              />
            </div>
            <div>
              <label htmlFor="mobileNo" className="block text-sm font-medium mb-1">Mobile No</label>
              <input
                type="tel"
                id="mobileNo"
                name="mobileNo"
                value={formData.mobileNo}
                onChange={handleChange}
                placeholder="9999999999"
                className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
                required
              />
            </div>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            {/* Gender Toggle */}
            <div>
              <label className="block text-sm font-medium mb-2">Gender</label>
              <div className="flex space-x-4">
                <button
                  type="button"
                  onClick={() => handleGenderToggle('male')}
                  className={`flex-1 flex items-center justify-center p-3 rounded-xl transition-all duration-200 ${
                    formData.gender === 'male' ? 'bg-yellow-500 text-black' : 'bg-yellow-700 hover:bg-yellow-600'
                  }`}
                >
                  <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24" strokeWidth="2" stroke="currentColor" className="w-6 h-6 mr-2">
                    <path strokeLinecap="round" strokeLinejoin="round" d="M15.75 6a3.75 3.75 0 1 1-7.5 0 3.75 3.75 0 0 1 7.5 0ZM4.501 20.118a7.5 7.5 0 0 1 14.998 0A17.933 17.933 0 0 1 12 21.75c-2.676 0-5.216-.584-7.499-1.632Z" />
                  </svg>
                  Male
                </button>
                <button
                  type="button"
                  onClick={() => handleGenderToggle('female')}
                  className={`flex-1 flex items-center justify-center p-3 rounded-xl transition-all duration-200 ${
                    formData.gender === 'female' ? 'bg-yellow-500 text-black' : 'bg-yellow-700 hover:bg-yellow-600'
                  }`}
                >
                  <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24" strokeWidth="2" stroke="currentColor" className="w-6 h-6 mr-2">
                    <path strokeLinecap="round" strokeLinejoin="round" d="M12 21a9 9 0 1 0 0-18 9 9 0 0 0 0 18Zm0-3a5.25 5.25 0 1 1 0-10.5 5.25 5.25 0 0 1 0 10.5Z" />
                    <path strokeLinecap="round" strokeLinejoin="round" d="M12 1.5V6m-2.25 5.25h4.5" />
                  </svg>
                  Female
                </button>
              </div>
            </div>

            {/* Blood Group */}
            <div>
              <label htmlFor="bloodGroup" className="block text-sm font-medium mb-1">Blood Group</label>
              <select
                id="bloodGroup"
                name="bloodGroup"
                value={formData.bloodGroup}
                onChange={handleChange}
                className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
                required
              >
                <option value="">Select</option>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>
                <option value="O+">O+</option>
                <option value="O-">O-</option>
              </select>
            </div>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            {/* Height & Weight */}
            <div>
              <label htmlFor="height" className="block text-sm font-medium mb-1">Height (cm)</label>
              <input
                type="number"
                id="height"
                name="height"
                value={formData.height}
                onChange={handleChange}
                placeholder="e.g., 175"
                className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
                required
              />
            </div>
            <div>
              <label htmlFor="weight" className="block text-sm font-medium mb-1">Weight (kg)</label>
              <input
                type="number"
                id="weight"
                name="weight"
                value={formData.weight}
                onChange={handleChange}
                placeholder="e.g., 70"
                className="w-full px-4 py-2 rounded-lg text-black focus:outline-none focus:ring-2 focus:ring-yellow-500"
                required
              />
            </div>
          </div>

          {/* Submit Button */}
          <button
            type="submit"
            className="w-full bg-yellow-500 text-black py-3 rounded-full font-bold shadow-md hover:bg-yellow-400 transition-colors duration-200 disabled:opacity-50 disabled:cursor-not-allowed"
            disabled={loading}
          >
            {loading ? 'Submitting...' : 'Submit'}
          </button>
        </form>

        {uploadMessage && (
          <p className="mt-4 text-center text-sm font-medium">{uploadMessage}</p>
        )}
      </div>
    </section>
  );
};

export default Profile;
