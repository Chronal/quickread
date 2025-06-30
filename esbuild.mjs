#!/usr/bin/env node

import * as esbuild from 'esbuild';
import path from 'node:path';

const OUTPUT_DIR = path.join('.', 'public', 'js');
const MAIN_ENTRY = path.join(OUTPUT_DIR, 'quickread.js');
const OUTFILE = path.join(OUTPUT_DIR, 'main.js');

await esbuild.build({
  entryPoints: [ MAIN_ENTRY ],
  outfile: OUTFILE,

  bundle: true,
  minify: false,
  sourcemap: true,
  format: 'esm',
  external: ["./lib/mupdf.js"],
});
