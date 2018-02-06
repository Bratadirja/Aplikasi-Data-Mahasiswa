mkdir halaman-github
cd halaman-github
echo "Hello World! Welcome to my website" >> index.html
git init
git add index.html
git commit -m "first commit"
git remote add origin https://github.com/Bratadirja/Bratadirja.github.io.git
git push -u origin master
