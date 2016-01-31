var browserify = require('browserify');
var concat = require('gulp-concat');
var gulp = require('gulp');
var nodemon = require('gulp-nodemon');
var reactify = require('reactify');
var source = require('vinyl-source-stream');

var config = {
  port: 8000,
  paths: {
    html: './*.html',
    js: './*.js',
    dist: './dist',
    css: [
      './node_modules/bootstrap/dist/css/bootstrap.min.css',
      './node_modules/bootstrap/dist/css/bootstrap-theme.min.css'
    ],
    mainJs: './main.js'
  }
};

var distJs = function() {
  browserify(config.paths.mainJs)
    .transform(reactify)
    .bundle()
    .on('error', console.error.bind(console))
    .pipe(source('bundle.js'))
    .pipe(gulp.dest(config.paths.dist))
};

gulp.task('dist-js', distJs());

var distHtml = function() {
  gulp.src(config.paths.html)
    .pipe(gulp.dest(config.paths.dist))
};

gulp.task('dist-html', distHtml());

var distCss = function() {
  gulp.src(config.paths.css)
    .pipe(concat('bundle.css'))
    .pipe(gulp.dest(config.paths.dist));
};

gulp.task('dist-css', distCss());

gulp.task('default', ['dist-js', 'dist-html', 'dist-css'], function() {
  nodemon({
    script: 'app.js',
    ext: 'js',
    env: {
      PORT:config.port
    },
    ignore: ['node_modules/**/*', 'dist/**/*']
  })
  .on('restart', function() {
      distJs();
      distHtml();
      distCss();
      console.log('Restarting');
  });
});