# rakibrary.com — new site

A plain HTML/CSS/JS site. It doesn't need a build step and works on GitHub Pages.

```
new-site/
├── index.html            Home
├── about.html            About & Experience (replaces Resume.html)
├── projects.html         IT labs + embedded builds
├── certifications.html   Roadmap + certificates (click to enlarge)
├── maker.html            3D prints, drone, photography, PC build
├── contact.html          Contact links + form
├── 404.html
├── css/style.css
├── js/main.js            Mobile menu, project filters, image viewer
├── assets/
│   ├── favicon.svg
│   ├── img/              ← filled in by move-images.sh
│   └── Rakib_Rary_Resume.pdf   ← made from your old résumé page; replace with your latest
└── move-images.sh
```

## 1. Copy your images in

```bash
bash ~/Desktop/Rakib-s_Website-main/new-site/move-images.sh
```

This copies, renames and resizes the images to 1600px. Your original folders stay as they are.

## 2. Add the missing pieces

- `assets/Rakib_Rary_Resume.pdf`: a working version is included; replace it with your newest résumé (keep the same file name)
- Headshot (optional): save it as `assets/img/headshot.jpg`, then in `index.html` change `assets/img/projects/robot-arm.jpg` (in the hero) to `assets/img/headshot.jpg`
- `contact.html`: replace `YOUR_FORM_ID` with a free form ID from formspree.io
- `certifications.html`: replace each `href="#"` on "Verify credential" with its Credly or verification link
- `certifications.html`: fill in the target dates for A+ and Network+

## 3. Preview

```bash
open ~/Desktop/Rakib-s_Website-main/new-site/index.html
```

## 4. Go live (replace the old site)

Copy everything inside `new-site/` into your GitHub repo's root, replacing the old pages, and push. Keep the `CNAME` file so rakibrary.com still works.
