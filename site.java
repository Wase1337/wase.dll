window.addEventListener("load", function() {
  var audio = document.getElementById("muzik");
  audio.play();
});
document.getElementById("incelemeKismi").style.display = "none";

<video autoplay loop muted id="arkaPlanVideo">
  <source src="videoDosyasi.mp4" type="video/mp4">
  Tarayıcınız video etiketini desteklemiyor.
</video>
<p id="videoDurduMesaji">Video durdu!</p>

<script>
  var video = document.getElementById("arkaPlanVideo");
  var videoDurduMesaji = document.getElementById("videoDurduMesaji");

  video.addEventListener("pause", function() {
    videoDurduMesaji.style.display = "block";
  });

  video.addEventListener("play", function() {
    videoDurduMesaji.style.display = "none";
  });
</script>
