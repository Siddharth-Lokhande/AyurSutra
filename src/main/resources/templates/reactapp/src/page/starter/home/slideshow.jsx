import React, { useState, useEffect } from "react";

const images = [
" /src/assets/images/1.jpeg",
"/src/assets/images/2.jpg",
"/src/assets/images/3.jpg",
"/src/assets/images/4.jpeg",
"/src/assets/images/5.jpg",
];
function ImageSlider() {
  const [current, setCurrent] = useState(0);

  // Auto change every 2 seconds
  useEffect(() => {
    const timer = setInterval(() => {
      setCurrent((prev) => (prev + 1) % images.length);
    }, 2000);

    return () => clearInterval(timer);
  }, []);

  return (
    <div
      style={{
        width: "800px",   // fixed width
        height: "400px",  // fixed height
        margin: "0 auto",
        overflow: "hidden",
        position: "relative",
        borderRadius: "12px",
        boxShadow: "0 4px 12px rgba(0,0,0,0.2)",
        background: "#000",
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
      }}
    >
      <img
        src={images[current]}
        alt={`Slide ${current + 1}`}
        style={{
          maxWidth: "100%",
          maxHeight: "100%",
          objectFit: "contain", // keeps aspect ratio
        }}
      />
    </div>
  );
}

export default ImageSlider;
