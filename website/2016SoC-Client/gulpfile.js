var gulp = require('gulp');
var plugins = require("gulp-load-plugins")();
var paths = require("./gulp_config.json");
var pkg = require('./package.json');
var fs = require('fs');

gulp.task('tasks', plugins.taskListing);

gulp.task('build-index', function () {
  return gulp.src(paths.index)
      .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-index', ['build-index'], function () {
  gulp.watch(paths.index, ['build-index']);
});

gulp.task('build-templateCache', function() {
  return gulp
      .src(paths.htmlTemplates)
      .pipe(plugins.minifyHtml({
        empty: true
      }))
      .pipe(plugins.angularTemplatecache('templates.js', {
        module: '2016SOC',
        standalone: false
      }))
      .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-templateCache', ['build-templateCache'],  function() {
  gulp.watch(paths.htmlTemplates, ['build-templateCache']);
});

gulp.task('build-css', function () {
  return gulp.src(paths.css)
      .pipe(plugins.concat('all.css'))
      .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-css', ['build-css'], function() {
  gulp.watch(paths.css, ['build-css']);
});
gulp.task('build-vendor-css', function(){
  return gulp.src(paths.vendorcss)
      .pipe(plugins.concat('vendor.css'))
      .pipe(gulp.dest(paths.dist));
})

gulp.task('watch-vendor-css', ['build-vendor-css'], function() {
  gulp.watch(paths.vendorcss, ['build-vendor-css']);
});
gulp.task('build-fonts', function() {
  return gulp.src(paths.fonts)
      .pipe(gulp.dest(paths.dist + "/fonts"));
});

gulp.task('watch-fonts', ['build-fonts'], function() {
  gulp.watch(paths.fonts, ['build-fonts']);
});


gulp.task('build-sounds', function() {
    return gulp.src(paths.sounds)
        .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-sounds', ['build-sounds'], function() {
    gulp.watch(paths.sounds, ['build-sounds']);
});

gulp.task('build-images', function() {
  return gulp.src(paths.img)
      .pipe(gulp.dest(paths.dist + '/img/'));
});

gulp.task('watch-images', ['build-images'], function() {
  gulp.watch(paths.img, ['build-images']);
});

gulp.task('build-js', function() {
  return gulp.src(paths.src)
      .pipe(plugins.sourcemaps.init())
      .pipe(plugins.plumber())
      .pipe(plugins.ngAnnotate())
      .pipe(plugins.concat('2016SOC.min.js'))
      .pipe(plugins.uglify({'mangle': false}))
      .pipe(plugins.sourcemaps.write())
      .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-js', ['build-js'], function() {
  gulp.watch(paths.src, ['build-js']);
});

gulp.task('build-vendorjs', function() {
  return gulp.src(paths.vendorjs)
      .pipe(plugins.concat('vendor.min.js'))
      .pipe(plugins.uglify())
      .pipe(gulp.dest(paths.dist));
});

gulp.task('watch-vendorjs', ['build-vendorjs'], function() {
  gulp.watch(paths.vendorjs, ['build-vendorjs']);
});

gulp.task('build', [
  'build-index',
  'build-templateCache',
  'build-css',
  'build-vendor-css',
  'build-fonts',
  'build-sounds',
  'build-images',
  'build-js',
  'build-vendorjs'
]);

gulp.task('watch-build', [
  'watch-index',
  'watch-templateCache',
  'watch-css',
  'watch-vendor-css',
  'watch-fonts',
  'watch-sounds',
  'watch-images',
  'watch-js',
  'watch-vendorjs'
]);

gulp.task('watch', ['watch-build']);

gulp.task('default', ['watch']);
