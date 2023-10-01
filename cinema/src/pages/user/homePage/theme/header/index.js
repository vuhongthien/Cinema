import { memo } from 'react';
import React, { useEffect, useRef } from 'react';
function HeaderRouter() {
  useEffect(() => {
    const anchorElements = document.querySelectorAll('.option');

    anchorElements.forEach((element) => {
      if (element.getAttribute('href') === window.location.pathname) {
        // Add the "active" class to the matching element
        element.classList.add('active');
      } else {
        // Remove the "active" class from other elements
        element.classList.remove('active');
      }
    });
  }, []);
  return (
    <>
      <a class="option p-4 pt-2 pb-2 col-auto" href='/'>All</a>
      <a class="option p-4 pt-2 pb-2 col-auto" href='/movies-page'>Movies</a>
      <a class="option p-4 pt-2 pb-2 col-auto" href='/tv-show-page'>TV shows</a>
    </>
  );
}


const Header = () => {
  const moviesSectionRef = useRef(null);
  useEffect(() => {
    const anchorElements = document.querySelectorAll('.option');

    anchorElements.forEach((element) => {
      if (element.getAttribute('href') === window.location.pathname) {
        // Add the "active" class to the matching element
        moviesSectionRef.current.scrollIntoView({ behavior: 'smooth' });
      }
    });
  }, []);

  return <>
    <div class="row d-flex justify-content-center p-3">
      <div class="col-md-4 me-auto">logo</div>
      <div class="col-md-4 d-flex justify-content-around">
        <a class="p-2" href="/movies-page">Movies</a>
        <a class="p-2" href="/tv-show-page">TV Shows</a>
        <a class="p-2" href="#">Favorite</a>
        <div class="dropdown">
          <button class="btn btn-secondary dropdown-toggle rounded-circle p-3 m-0" type="button" data-bs-toggle="dropdown" aria-expanded="false">
            <i class="fa-solid fa-user"></i>
          </button>
          <ul class="dropdown-menu">
            <li>
              <a class="dropdown-item" href="#">Action</a>
            </li>
            <li>
              <a class="dropdown-item" href="#">Another action</a>
            </li>
            <li>
              <a class="dropdown-item" href="#">Something else here</a>
            </li>
          </ul>
        </div>
      </div></div>
    <div className='header-search container'>
      <div className='info mt-5 pt-5'>
        <span className='fs-1'>
          Name user
        </span>
        <p>List of movies and TV Shows, I, Pramod Poudel have watched till date.<br /> Explore what I have watched and also feel free to make a suggestion. 😉</p>
      </div>
      <div class="form col-md-5 mt-5" ref={moviesSectionRef}>
        <input type="search" class="form-control form-input" placeholder="Search anything..." />
        <span class="left-pan"></span></div>
      <div className='option col-md-5 mt-5 d-flex justify-content-between p-2'>
        <HeaderRouter />
      </div>
    </div>
  </>;

};

export default memo(Header);