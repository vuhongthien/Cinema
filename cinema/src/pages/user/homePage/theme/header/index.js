import { memo } from 'react';

const Header = () => {
  return <>
    <div class="row d-flex justify-content-center p-3">
      <div class="col-md-4 me-auto">logo</div>
      <div class="col-md-4 d-flex justify-content-around">
        <a class="p-2" href="#">Movies</a>
        <a class="p-2" href="#">TV Shows</a>
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
      <div class="form col-md-5 mt-5">
        <i class="fa fa-search"></i>
        <input type="text" class="form-control form-input" placeholder="Search anything..." />
        <span class="left-pan"><i class="fa fa-microphone"></i></span>
      </div>
      <div className='option col-md-5 mt-5 d-flex justify-content-between p-2'>
        <a class="option1 p-4 pt-2 pb-2 col-auto" href='#'>All</a>
        <a class="option2 p-4 pt-2 pb-2 col-auto" href='#'>Movies</a>
        <a class="option3 p-4 pt-2 pb-2 col-auto" href='#'>TV shows</a>
      </div>
    </div>
  </>;

};

export default memo(Header);