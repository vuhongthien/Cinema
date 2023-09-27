import { memo } from 'react';
import Footer from '../footer';
import Header from '../header';

const MasterLayout = ({children, ...props}) => {
  return (
    <>
    <div className='gradient-bg' {...props}> 
       <Header />
       {children}
       <Footer /> 
    </div>
    </>
  );
};

export default memo(MasterLayout);