/* eslint-disable jsx-a11y/anchor-is-valid */
import {useEffect} from 'react'
import {Outlet, Link} from 'react-router-dom'
import {toAbsoluteUrl} from '../../../_metronic/helpers'

const AuthLayout = () => {
  useEffect(() => {
    const root = document.getElementById('root')
    if (root) {
      root.style.height = '100%'
    }
    return () => {
      if (root) {
        root.style.height = 'auto'
      }
    }
  }, [])

  return (
    <div className='d-flex flex-column flex-lg-row flex-column-fluid h-100'>
      <div className='d-flex flex-column flex-lg-row-fluid w-lg-50 p-10 order-2 order-lg-1'>
        <div className='d-flex flex-center flex-column flex-lg-row-fluid'>
          <div className='w-lg-500px p-10'>
            <Outlet />
          </div>
        </div>
      </div>
      <div
        className='d-flex flex-lg-row-fluid w-lg-50 bgi-size-cover bgi-position-center order-1 order-lg-2'
        style={{backgroundImage: `url(${toAbsoluteUrl('/media/misc/auth-bg.png')})`}}
      >
        <div className='d-flex flex-column flex-center py-15 px-5 px-md-15 w-100'>
          <img
            className='mx-auto w-275px w-md-50 w-xl-500px mb-10 mb-lg-20'
            src={toAbsoluteUrl('/media/logos/vr6.png')}
            alt=''
          />
          <h1 className='text-white fs-2qx fw-bolder text-center mb-7'>
            VRevolution
          </h1>
          <div className='text-white fs-base text-center'>
            Where Science meets Virtual Reality
          </div>
        </div>
      </div>
    </div>
  )
}

export {AuthLayout}
