/* ============================================================
   PORTFOLIO — main.js (Production)
   ============================================================ */
'use strict';

/* ---- LOADING SCREEN ---- */
window.addEventListener('load', () => {
  setTimeout(() => {
    document.getElementById('loader').classList.add('hidden');
    document.body.style.overflow = '';
    initCounters();
  }, 1200);
});
document.body.style.overflow = 'hidden';

/* ---- CUSTOM CURSOR ---- */
const cursor = document.getElementById('cursor');
const follower = document.getElementById('cursor-follower');
let mouseX = 0, mouseY = 0, followerX = 0, followerY = 0;

document.addEventListener('mousemove', e => {
  mouseX = e.clientX; mouseY = e.clientY;
  cursor.style.left = mouseX + 'px'; cursor.style.top = mouseY + 'px';
});

function animateCursor() {
  followerX += (mouseX - followerX) * 0.12;
  followerY += (mouseY - followerY) * 0.12;
  follower.style.left = followerX + 'px'; follower.style.top = followerY + 'px';
  requestAnimationFrame(animateCursor);
}
animateCursor();

document.querySelectorAll('a, button, input, select, textarea, .project-card, .service-card, .social-card, .skill-icon-card').forEach(el => {
  el.addEventListener('mouseenter', () => { cursor.classList.add('hover'); follower.classList.add('hover'); });
  el.addEventListener('mouseleave', () => { cursor.classList.remove('hover'); follower.classList.remove('hover'); });
});

/* ---- NAVBAR SCROLL ---- */
const navbar = document.getElementById('navbar');
window.addEventListener('scroll', () => {
  navbar.classList.toggle('scrolled', window.scrollY > 60);
});

/* ---- MOBILE MENU ---- */
const hamburger = document.getElementById('hamburger');
const mobileMenu = document.getElementById('mobileMenu');
hamburger.addEventListener('click', () => {
  mobileMenu.classList.toggle('open');
});
function closeMobileMenu() { mobileMenu.classList.remove('open'); }
document.addEventListener('click', e => {
  if (!hamburger.contains(e.target) && !mobileMenu.contains(e.target)) closeMobileMenu();
});

/* ---- HERO CANVAS (Particle Network) ---- */
(function initCanvas() {
  const canvas = document.getElementById('heroCanvas');
  if (!canvas) return;
  const ctx = canvas.getContext('2d');
  let W, H, particles = [];

  function resize() {
    W = canvas.width = canvas.offsetWidth;
    H = canvas.height = canvas.offsetHeight;
  }
  window.addEventListener('resize', () => { resize(); initParticles(); });
  resize();

  function Particle() {
    this.x = Math.random() * W;
    this.y = Math.random() * H;
    this.vx = (Math.random() - 0.5) * 0.6;
    this.vy = (Math.random() - 0.5) * 0.6;
    this.size = Math.random() * 2 + 0.5;
    this.opacity = Math.random() * 0.5 + 0.1;
  }

  function initParticles() {
    particles = [];
    const count = Math.min(Math.floor((W * H) / 14000), 80);
    for (let i = 0; i < count; i++) particles.push(new Particle());
  }
  initParticles();

  const accent = [0, 212, 170];

  function draw() {
    ctx.clearRect(0, 0, W, H);
    for (let i = 0; i < particles.length; i++) {
      const p = particles[i];
      p.x += p.vx; p.y += p.vy;
      if (p.x < 0 || p.x > W) p.vx *= -1;
      if (p.y < 0 || p.y > H) p.vy *= -1;
      ctx.beginPath();
      ctx.arc(p.x, p.y, p.size, 0, Math.PI * 2);
      ctx.fillStyle = `rgba(${accent[0]},${accent[1]},${accent[2]},${p.opacity})`;
      ctx.fill();
      for (let j = i + 1; j < particles.length; j++) {
        const q = particles[j];
        const dx = p.x - q.x, dy = p.y - q.y;
        const dist = Math.sqrt(dx * dx + dy * dy);
        if (dist < 120) {
          ctx.beginPath();
          ctx.moveTo(p.x, p.y); ctx.lineTo(q.x, q.y);
          ctx.strokeStyle = `rgba(${accent[0]},${accent[1]},${accent[2]},${(1 - dist / 120) * 0.12})`;
          ctx.lineWidth = 1; ctx.stroke();
        }
      }
    }
    requestAnimationFrame(draw);
  }
  draw();
})();

/* ---- TYPEWRITER ---- */
(function initTypewriter() {
  const el = document.getElementById('typewriter');
  if (!el) return;
  const phrases = [
    'Software Engineer',
    'Full Stack Developer',
    'AI Integration Expert',
    'Java Spring Boot Dev',
    'React Developer',
    'Open Source Contributor'
  ];
  let pi = 0, ci = 0, deleting = false;
  function tick() {
    const phrase = phrases[pi];
    el.textContent = deleting ? phrase.slice(0, ci--) : phrase.slice(0, ci++);
    let delay = deleting ? 60 : 90;
    if (!deleting && ci > phrase.length) { delay = 1800; deleting = true; }
    else if (deleting && ci < 0) { ci = 0; deleting = false; pi = (pi + 1) % phrases.length; delay = 400; }
    setTimeout(tick, delay);
  }
  setTimeout(tick, 1500);
})();

/* ---- COUNTER ANIMATION ---- */
function animateCounter(el, target, suffix = '') {
  let start = 0;
  const duration = 1800;
  const step = timestamp => {
    if (!start) start = timestamp;
    const progress = Math.min((timestamp - start) / duration, 1);
    const eased = 1 - Math.pow(1 - progress, 3);
    el.textContent = Math.floor(eased * target) + suffix;
    if (progress < 1) requestAnimationFrame(step);
    else el.textContent = target + suffix;
  };
  requestAnimationFrame(step);
}

function initCounters() {
  document.querySelectorAll('.stat-num').forEach(el => {
    const target = parseInt(el.dataset.target);
    const suffix = target >= 500 ? '+' : '';
    animateCounter(el, target, suffix);
  });
}

/* ---- INTERSECTION OBSERVER FOR REVEALS ---- */
const revealObserver = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('visible');
      // Counter animation for about stats
      if (entry.target.classList.contains('about-stat-card')) {
        const numEl = entry.target.querySelector('.asc-num');
        if (numEl && !numEl.dataset.animated) {
          numEl.dataset.animated = '1';
          const target = parseInt(numEl.dataset.target);
          const suffix = target >= 500 ? '+' : '';
          animateCounter(numEl, target, suffix);
        }
      }
    }
  });
}, { threshold: 0.15 });

// Skill bar observer
const skillObserver = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.querySelectorAll('.sb-fill').forEach(bar => {
        setTimeout(() => { bar.style.width = bar.dataset.w + '%'; }, 100);
      });
    }
  });
}, { threshold: 0.3 });

document.addEventListener('DOMContentLoaded', () => {
  // Add reveal classes
  document.querySelectorAll('.section-header, .about-stat-card, .project-card, .service-card, .social-card, .testimonial-card, .tl-item').forEach((el, i) => {
    el.classList.add('reveal');
    el.style.transitionDelay = (i % 4) * 0.1 + 's';
    revealObserver.observe(el);
  });

  document.querySelectorAll('#skills .section-header, .skills-tabs, .skills-content').forEach(el => {
    skillObserver.observe(el);
  });

  // Skill tab active panel also triggers bars
  document.querySelectorAll('.skill-panel').forEach(panel => {
    skillObserver.observe(panel);
  });

  // Active section in navbar
  const sections = document.querySelectorAll('section[id]');
  const navLinks = document.querySelectorAll('.nav-links a');
  const sectionObserver = new IntersectionObserver(entries => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        navLinks.forEach(link => {
          link.classList.toggle('active-nav', link.getAttribute('href') === '#' + entry.target.id);
        });
      }
    });
  }, { rootMargin: '-40% 0px -40%' });
  sections.forEach(s => sectionObserver.observe(s));
});

/* ---- SKILLS TABS ---- */
document.querySelectorAll('.skill-tab').forEach(tab => {
  tab.addEventListener('click', () => {
    document.querySelectorAll('.skill-tab').forEach(t => t.classList.remove('active'));
    document.querySelectorAll('.skill-panel').forEach(p => p.classList.remove('active'));
    tab.classList.add('active');
    const panel = document.getElementById('tab-' + tab.dataset.tab);
    if (panel) {
      panel.classList.add('active');
      // Animate skill bars
      setTimeout(() => {
        panel.querySelectorAll('.sb-fill').forEach(bar => {
          bar.style.width = bar.dataset.w + '%';
        });
      }, 50);
    }
  });
});

// Animate initial skill bars
setTimeout(() => {
  const activePanel = document.querySelector('.skill-panel.active');
  if (activePanel) {
    activePanel.querySelectorAll('.sb-fill').forEach(bar => {
      bar.style.width = bar.dataset.w + '%';
    });
  }
}, 400);

/* ---- PROJECT FILTER ---- */
const pfBtns = document.querySelectorAll('.pf-btn');
const projectCards = document.querySelectorAll('.project-card');

pfBtns.forEach(btn => {
  btn.addEventListener('click', () => {
    pfBtns.forEach(b => b.classList.remove('active'));
    btn.classList.add('active');
    const filter = btn.dataset.filter;
    projectCards.forEach(card => {
      const cats = card.dataset.category || '';
      const show = filter === 'all' || cats.split(' ').includes(filter);
      card.style.opacity = '0'; card.style.transform = 'scale(0.95)';
      setTimeout(() => {
        if (show) {
          card.classList.remove('hidden');
          requestAnimationFrame(() => {
            card.style.opacity = ''; card.style.transform = '';
          });
        } else {
          card.classList.add('hidden');
        }
      }, 150);
    });
  });
});

/* ---- THEME TOGGLE ---- */
const themeToggle = document.getElementById('themeToggle');
let isDark = true;
themeToggle.addEventListener('click', () => {
  isDark = !isDark;
  document.documentElement.setAttribute('data-theme', isDark ? 'dark' : 'light');
  themeToggle.querySelector('.theme-icon').textContent = isDark ? '☀' : '🌙';
});

/* ---- CHATBOT ---- */
const chatbotAnswers = {
  default: [
    "I'd be happy to tell you more! Could you ask about skills, projects, availability, or pricing?",
    "Great question! Feel free to ask about Alex's tech stack, past projects, or how to hire him.",
    "I'm Alex's AI assistant. Try asking about skills, contact info, or project experience!"
  ],
  skills: "Alex is expert in Java, Spring Boot, React, JavaScript, SQL, REST APIs, and AI integrations (OpenAI, Gemini). He has 2+ years of full-stack development experience.",
  projects: "Alex has built 24+ projects including AI-powered apps, e-commerce platforms, hospital management systems, dashboards, and more. Check the Projects section for details!",
  available: "Yes! Alex is currently available for freelance projects and full-time opportunities. Response time is within 24 hours.",
  hire: "To hire Alex, you can fill out the form in the 'Hire Me' section, WhatsApp at +91-9999-999999, or email at alex@example.com.",
  price: "Project pricing depends on scope and complexity. Typical range: $500 for simple sites to $5000+ for full-stack enterprise apps. Fill the contact form for a custom quote!",
  contact: "You can reach Alex via: Email (alex@example.com), WhatsApp (+91-9999-999999), or through the contact form on this page. Response within 24 hours guaranteed!",
  java: "Java is Alex's primary language! He's proficient in Core Java, Spring Boot, Hibernate, JPA, REST APIs, and Spring Security.",
  react: "React is Alex's go-to for frontend! He builds responsive, performant UIs with hooks, context API, Redux, and integrates seamlessly with REST APIs.",
  ai: "Alex integrates AI into web apps using OpenAI GPT-4, Google Gemini, LangChain, and custom ML models. He's built AI chatbots, resume analyzers, and recommendation systems."
};

function getBotResponse(msg) {
  msg = msg.toLowerCase();
  if (msg.includes('skill') || msg.includes('tech') || msg.includes('stack')) return chatbotAnswers.skills;
  if (msg.includes('project') || msg.includes('portfolio') || msg.includes('work')) return chatbotAnswers.projects;
  if (msg.includes('available') || msg.includes('free') || msg.includes('open')) return chatbotAnswers.available;
  if (msg.includes('hire') || msg.includes('freelance') || msg.includes('contract')) return chatbotAnswers.hire;
  if (msg.includes('price') || msg.includes('cost') || msg.includes('rate') || msg.includes('budget')) return chatbotAnswers.price;
  if (msg.includes('contact') || msg.includes('reach') || msg.includes('email') || msg.includes('whatsapp')) return chatbotAnswers.contact;
  if (msg.includes('java') || msg.includes('spring')) return chatbotAnswers.java;
  if (msg.includes('react') || msg.includes('frontend')) return chatbotAnswers.react;
  if (msg.includes('ai') || msg.includes('gpt') || msg.includes('gemini') || msg.includes('machine')) return chatbotAnswers.ai;
  return chatbotAnswers.default[Math.floor(Math.random() * chatbotAnswers.default.length)];
}

function toggleChatbot() {
  const container = document.getElementById('chatbotContainer');
  container.classList.toggle('open');
}

function sendChatMessage() {
  const input = document.getElementById('chatInput');
  const messages = document.getElementById('chatMessages');
  const msg = input.value.trim();
  if (!msg) return;

  // User message
  const userDiv = document.createElement('div');
  userDiv.className = 'cb-msg user';
  userDiv.textContent = msg;
  messages.appendChild(userDiv);
  input.value = '';
  messages.scrollTop = messages.scrollHeight;

  // Bot typing
  const typingDiv = document.createElement('div');
  typingDiv.className = 'cb-msg bot';
  typingDiv.textContent = '...';
  messages.appendChild(typingDiv);
  messages.scrollTop = messages.scrollHeight;

  setTimeout(() => {
    typingDiv.textContent = getBotResponse(msg);
    messages.scrollTop = messages.scrollHeight;
  }, 800);
}

function handleChatKey(e) {
  if (e.key === 'Enter') sendChatMessage();
}

/* ---- PERSONALIZED GREETING ---- */
(function personalGreeting() {
  const hour = new Date().getHours();
  let greeting = 'Good Morning';
  if (hour >= 12 && hour < 17) greeting = 'Good Afternoon';
  else if (hour >= 17 && hour < 21) greeting = 'Good Evening';
  else if (hour >= 21 || hour < 5) greeting = 'Working Late';
  // Append to chatbot initial message
  const msgs = document.getElementById('chatMessages');
  if (msgs && msgs.firstChild) {
    const first = msgs.querySelector('.cb-msg.bot');
    if (first) {
      first.textContent = `${greeting}! 👋 I'm Alex's AI assistant. Ask me about skills, projects, availability, or how to hire Alex!`;
    }
  }
})();

/* ---- FORM HANDLERS ---- */
function handleHireForm(e) {
  e.preventDefault();
  const btn = e.target.querySelector('button[type="submit"]');
  btn.textContent = 'Sending...';
  setTimeout(() => {
    btn.textContent = '✅ Sent Successfully!';
    btn.style.background = '#22c55e';
    setTimeout(() => { btn.textContent = 'Send Project Brief'; btn.style.background = ''; e.target.reset(); }, 3000);
  }, 1500);
}

function handleContactForm(e) {
  e.preventDefault();
  const btn = e.target.querySelector('button[type="submit"]');
  const success = document.getElementById('form-success');
  btn.textContent = 'Sending...'; btn.disabled = true;
  setTimeout(() => {
    btn.textContent = 'Send Message'; btn.disabled = false;
    success.style.display = 'block';
    e.target.reset();
    setTimeout(() => { success.style.display = 'none'; }, 5000);
  }, 1500);
}

/* ---- RESUME DOWNLOAD (placeholder) ---- */
document.getElementById('resumeBtn')?.addEventListener('click', e => {
  e.preventDefault();
  alert('📄 Resume download — link your actual PDF resume file here!');
});

/* ---- SMOOTH REVEAL ON SCROLL ---- */
window.addEventListener('scroll', () => {
  document.querySelectorAll('.reveal:not(.visible), .reveal-left:not(.visible), .reveal-right:not(.visible)').forEach(el => {
    const rect = el.getBoundingClientRect();
    if (rect.top < window.innerHeight * 0.88) el.classList.add('visible');
  });
}, { passive: true });

/* ---- ACTIVE NAV LINK STYLE ---- */
document.head.insertAdjacentHTML('beforeend', `<style>
  .nav-links a.active-nav { color: var(--accent) !important; }
  .nav-links a.active-nav::after { width: 100% !important; }
</style>`);

console.log('%c🚀 Portfolio Loaded Successfully', 'color:#00d4aa;font-size:18px;font-weight:bold;');
console.log('%cBuilt with HTML5 · CSS3 · Vanilla JS · Canvas API', 'color:#64748b;font-size:12px;');