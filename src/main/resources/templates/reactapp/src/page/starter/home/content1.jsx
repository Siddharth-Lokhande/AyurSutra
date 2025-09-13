import React from 'react';

function Content1() {
  return (
    <section className="body-font bg-black text-white">
      <div className="container px-5 py-24 mx-auto">
        <div className="flex flex-col text-center w-full mb-20">
          <h2 className="text-xs text-white tracking-widest font-medium title-font mb-1">AYURVEDA PANCHAKARMA</h2>
          <h1 className="sm:text-3xl text-2xl font-medium title-font mb-4 text-white">Panchakarma: The Art of Ayurvedic Detox</h1>
          <p className="lg:w-2/3 mx-auto leading-relaxed text-base text-white">
            Panchakarma is Ayurveda’s signature detoxification and rejuvenation therapy. It helps restore balance, eliminate toxins, and promote holistic wellness through five core procedures.
          </p>
        </div>
        <div className="flex flex-wrap">
          <div className="xl:w-1/4 lg:w-1/2 md:w-full px-8 py-6 border-l-2 border-gray-200 border-opacity-60">
            <h2 className="text-lg sm:text-xl text-white font-medium title-font mb-2">Vamana (Therapeutic Emesis)</h2>
            <p className="leading-relaxed text-base mb-4 text-white">
              Vamana is a controlled process of therapeutic vomiting to expel toxins from the upper digestive tract, especially for Kapha-related disorders.
            </p>
            <a className="text-white inline-flex items-center">Learn More
              <svg fill="none" stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" className="w-4 h-4 ml-2" viewBox="0 0 24 24">
                <path d="M5 12h14M12 5l7 7-7 7"></path>
              </svg>
            </a>
          </div>
          <div className="xl:w-1/4 lg:w-1/2 md:w-full px-8 py-6 border-l-2 border-gray-200 border-opacity-60">
            <h2 className="text-lg sm:text-xl text-white font-medium title-font mb-2">Virechana (Purgation)</h2>
            <p className="leading-relaxed text-base mb-4 text-white">
              Virechana uses herbal laxatives to cleanse the gastrointestinal tract, targeting Pitta imbalances and promoting digestive health.
            </p>
            <a className="text-white inline-flex items-center">Learn More
              <svg fill="none" stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" className="w-4 h-4 ml-2" viewBox="0 0 24 24">
                <path d="M5 12h14M12 5l7 7-7 7"></path>
              </svg>
            </a>
          </div>
          <div className="xl:w-1/4 lg:w-1/2 md:w-full px-8 py-6 border-l-2 border-gray-200 border-opacity-60">
            <h2 className="text-lg sm:text-xl text-white font-medium title-font mb-2">Basti (Medicated Enema)</h2>
            <p className="leading-relaxed text-base mb-4 text-white">
              Basti involves administering herbal decoctions or oils via enema, primarily to balance Vata dosha and support joint and nerve health.
            </p>
            <a className="text-white inline-flex items-center">Learn More
              <svg fill="none" stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" className="w-4 h-4 ml-2" viewBox="0 0 24 24">
                <path d="M5 12h14M12 5l7 7-7 7"></path>
              </svg>
            </a>
          </div>
          <div className="xl:w-1/4 lg:w-1/2 md:w-full px-8 py-6 border-l-2 border-gray-200 border-opacity-60">
            <h2 className="text-lg sm:text-xl text-white font-medium title-font mb-2">Nasya & Raktamokshana</h2>
            <p className="leading-relaxed text-base mb-4 text-white">
              Nasya (nasal therapy) and Raktamokshana (bloodletting) are specialized Panchakarma procedures for head, neck, and blood purification.
            </p>
            <a className="text-white inline-flex items-center">Learn More
              <svg fill="none" stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" className="w-4 h-4 ml-2" viewBox="0 0 24 24">
                <path d="M5 12h14M12 5l7 7-7 7"></path>
              </svg>
            </a>
          </div>
        </div>
        <button className="flex mx-auto mt-16 text-white bg-indigo-500 border-0 py-2 px-8 focus:outline-none hover:bg-indigo-600 rounded text-lg">
          Explore Panchakarma
        </button>
      </div>
    </section>
  );
}

export default Content1;