	var mySwiper = new Swiper('.swiper-container', {
		slidesPerView :1,
		navigation : {
			prevEl : '.swiper-button-prev',
			nextEl : '.swiper-button-next',
			},
			autoplay : {
				delay : 2000,
			}
		});
	var mySwiper = new Swiper('.swiper-container1', {
		slidesPerView :1,
		breakpoints : {
			640:{
				slidesPerView:2,
			},
			1024:{
				slidesPerView:3,
			},
		}
		});
