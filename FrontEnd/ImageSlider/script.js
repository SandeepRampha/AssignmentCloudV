const images = [
    'https://cdn.create.vista.com/api/media/small/88819970/stock-photo-snowy-track-in-the-mountains',
    'https://media.istockphoto.com/id/485371557/photo/twilight-at-spirit-island.jpg?s=612x612&w=0&k=20&c=FSGliJ4EKFP70Yjpzso0HfRR4WwflC6GKfl4F3Hj7fk=',
    'https://cdn.create.vista.com/api/media/small/609491218/stock-photo-train-approaches-morant-curve-famous-viewpoint-banff-national-park-bow',
    'https://cdn.create.vista.com/api/media/small/359777418/stock-photo-beautiful-emerald-lake-summer-yoho-national-park-british-columbia-canada'
];

let currentIndex = 0;

const imageElement = document.getElementById('slider-image');
const nextButton = document.getElementById('next');
const prevButton = document.getElementById('prev');

function showImage(index) {
    imageElement.src = images[index];
}

showImage(currentIndex);

nextButton.addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % images.length; // Loop to start
    showImage(currentIndex);
});

prevButton.addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
});
