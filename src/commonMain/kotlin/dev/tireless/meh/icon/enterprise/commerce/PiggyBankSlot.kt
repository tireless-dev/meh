// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PiggyBankSlot: ImageVector
  get() {
    val current = _piggyBankSlot
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PiggyBankSlot",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="7" height="2" x="13.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 11
          moveTo(x = 13.0f, y = 11.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // M29 13 h-2.02 A5.8 5.8 0 0 0 25 8.85 V5 a1 1 0 0 0 -1.6 -.8 L19.67 7 H15 c-5.51 0 -9.46 3.24 -9.95 8 H5 a1 1 0 0 1 -1 -1 v-2 H2 v2 a3 3 0 0 0 3 3 h.07 A9.2 9.2 0 0 0 9 23.56 V27 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-2 h3 v2 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-3.36 A5.1 5.1 0 0 0 26.82 20 H29 a1 1 0 0 0 1 -1 v-5 a1 1 0 0 0 -1 -1 m-1 5 h-2.88 c-.3 2.75 -.82 3.49 -3.12 4.32 V26 h-2 v-3 h-7 v3 h-2 v-3.62 A7 7 0 0 1 7 16 c0 -4.84 4.02 -7 8 -7 h5.33 L23 7 v2.78 c2.42 1.86 1.91 3.18 2.02 5.22 H28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 13
          moveTo(x = 29.0f, y = 13.0f)
          // h -2.02
          horizontalLineToRelative(dx = -2.02f)
          // A 5.8 5.8 0 0 0 25 8.85
          arcTo(
            horizontalEllipseRadius = 5.8f,
            verticalEllipseRadius = 5.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 8.85f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -1.6 -0.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.6f,
            dy1 = -0.8f,
          )
          // L 19.67 7
          lineTo(x = 19.67f, y = 7.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // c -5.51 0 -9.46 3.24 -9.95 8
          curveToRelative(
            dx1 = -5.51f,
            dy1 = 0.0f,
            dx2 = -9.46f,
            dy2 = 3.24f,
            dx3 = -9.95f,
            dy3 = 8.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 0.07
          horizontalLineToRelative(dx = 0.07f)
          // A 9.2 9.2 0 0 0 9 23.56
          arcTo(
            horizontalEllipseRadius = 9.2f,
            verticalEllipseRadius = 9.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 23.56f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -3.36
          verticalLineToRelative(dy = -3.36f)
          // A 5.1 5.1 0 0 0 26.82 20
          arcTo(
            horizontalEllipseRadius = 5.1f,
            verticalEllipseRadius = 5.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.82f,
            y1 = 20.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -1 5
          moveToRelative(dx = -1.0f, dy = 5.0f)
          // h -2.88
          horizontalLineToRelative(dx = -2.88f)
          // c -0.3 2.75 -0.82 3.49 -3.12 4.32
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 2.75f,
            dx2 = -0.82f,
            dy2 = 3.49f,
            dx3 = -3.12f,
            dy3 = 4.32f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3.62
          verticalLineToRelative(dy = -3.62f)
          // A 7 7 0 0 1 7 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.0f,
            y1 = 16.0f,
          )
          // c 0 -4.84 4.02 -7 8 -7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.84f,
            dx2 = 4.02f,
            dy2 = -7.0f,
            dx3 = 8.0f,
            dy3 = -7.0f,
          )
          // h 5.33
          horizontalLineToRelative(dx = 5.33f)
          // L 23 7
          lineTo(x = 23.0f, y = 7.0f)
          // v 2.78
          verticalLineToRelative(dy = 2.78f)
          // c 2.42 1.86 1.91 3.18 2.02 5.22
          curveToRelative(
            dx1 = 2.42f,
            dy1 = 1.86f,
            dx2 = 1.91f,
            dy2 = 3.18f,
            dx3 = 2.02f,
            dy3 = 5.22f,
          )
          // H 28z
        horizontalLineTo(x = 28.0f)
        close()
      }
      // <rect width="32" height="32" fill="#000" style="fill:none" />
      path(
        fill = SolidColor(Color.Transparent),
      ) {
        // M 0 0
        moveTo(x = 0.0f, y = 0.0f)
        // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _piggyBankSlot = it }
  }

@Suppress("ObjectPropertyName")
private var _piggyBankSlot: ImageVector? = null
