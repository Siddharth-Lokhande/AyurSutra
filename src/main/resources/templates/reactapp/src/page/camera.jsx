import React, { useEffect, useRef, useState } from "react";

export default function CameraAudio() {
  const videoRef = useRef(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    async function startMedia() {
      try {
        const stream = await navigator.mediaDevices.getUserMedia({
          video: true,
          audio: true,
        });
        if (videoRef.current) {
          videoRef.current.srcObject = stream;
        }
      } catch (err) {
        setError(err.message);
      }
    }

    startMedia();
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-xl font-bold mb-2">Camera & Microphone</h1>
      {error ? (
        <p className="text-red-500">Error: {error}</p>
      ) : (
        <video
          ref={videoRef}
          autoPlay
          playsInline
          controls
          className="w-full max-w-md rounded-lg shadow-md"
        />
      )}
    </div>
  );
}
