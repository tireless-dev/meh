// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CategoryAnd: ImageVector
  get() {
    val current = _categoryAnd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CategoryAnd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 30 v-4 h11 v4 h2 v-4 h11 v4 h2 v-4 a2 2 0 0 0 -2 -2 H17 v-5 h-2 v5 H4 a2 2 0 0 0 -2 2 v4Z m16.7 -16.01 A10 10 0 0 0 21.95 10 H23 V8 h-3 v1 a9 9 0 0 1 -.66 3.27 l-2.69 -3.39 a5 5 0 0 0 2.14 -2.37 3.3 3.3 0 0 0 -.18 -2.7 3.4 3.4 0 0 0 -2.24 -1.7 3.47 3.47 0 0 0 -4.23 2.11 c-.5 1.55 .45 3.12 1.27 4.11 a4.7 4.7 0 0 0 -2.35 4.83 A4.45 4.45 0 0 0 15.43 17 a5.8 5.8 0 0 0 3.97 -1.42 L20.53 17 h2.55Z m-6.65 -9.15 A1.3 1.3 0 0 1 15.4 4 a2 2 0 0 1 .53 .06 1.4 1.4 0 0 1 .9 .7 1.3 1.3 0 0 1 .09 1.04 3.7 3.7 0 0 1 -1.69 1.6 c-.66 -.72 -1.43 -1.83 -1.2 -2.56 M15.43 15 a2.44 2.44 0 0 1 -2.4 -2.15 2.8 2.8 0 0 1 1.82 -3.03 l3.3 4.18 a4 4 0 0 1 -2.72 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 30
          moveTo(x = 4.0f, y = 30.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 16.7 -16.01
          moveToRelative(dx = 16.7f, dy = -16.01f)
          // A 10 10 0 0 0 21.95 10
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.95f,
            y1 = 10.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 9 9 0 0 1 -0.66 3.27
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.66f,
            dy1 = 3.27f,
          )
          // l -2.69 -3.39
          lineToRelative(dx = -2.69f, dy = -3.39f)
          // a 5 5 0 0 0 2.14 -2.37
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.14f,
            dy1 = -2.37f,
          )
          // a 3.3 3.3 0 0 0 -0.18 -2.7
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.18f,
            dy1 = -2.7f,
          )
          // a 3.4 3.4 0 0 0 -2.24 -1.7
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.24f,
            dy1 = -1.7f,
          )
          // a 3.47 3.47 0 0 0 -4.23 2.11
          arcToRelative(
            a = 3.47f,
            b = 3.47f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.23f,
            dy1 = 2.11f,
          )
          // c -0.5 1.55 0.45 3.12 1.27 4.11
          curveToRelative(
            dx1 = -0.5f,
            dy1 = 1.55f,
            dx2 = 0.45f,
            dy2 = 3.12f,
            dx3 = 1.27f,
            dy3 = 4.11f,
          )
          // a 4.7 4.7 0 0 0 -2.35 4.83
          arcToRelative(
            a = 4.7f,
            b = 4.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.35f,
            dy1 = 4.83f,
          )
          // A 4.45 4.45 0 0 0 15.43 17
          arcTo(
            horizontalEllipseRadius = 4.45f,
            verticalEllipseRadius = 4.45f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.43f,
            y1 = 17.0f,
          )
          // a 5.8 5.8 0 0 0 3.97 -1.42
          arcToRelative(
            a = 5.8f,
            b = 5.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.97f,
            dy1 = -1.42f,
          )
          // L 20.53 17
          lineTo(x = 20.53f, y = 17.0f)
          // h 2.55z
          horizontalLineToRelative(dx = 2.55f)
          close()
          // m -6.65 -9.15
          moveToRelative(dx = -6.65f, dy = -9.15f)
          // A 1.3 1.3 0 0 1 15.4 4
          arcTo(
            horizontalEllipseRadius = 1.3f,
            verticalEllipseRadius = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.4f,
            y1 = 4.0f,
          )
          // a 2 2 0 0 1 0.53 0.06
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.53f,
            dy1 = 0.06f,
          )
          // a 1.4 1.4 0 0 1 0.9 0.7
          arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 0.7f,
          )
          // a 1.3 1.3 0 0 1 0.09 1.04
          arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.09f,
            dy1 = 1.04f,
          )
          // a 3.7 3.7 0 0 1 -1.69 1.6
          arcToRelative(
            a = 3.7f,
            b = 3.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.69f,
            dy1 = 1.6f,
          )
          // c -0.66 -0.72 -1.43 -1.83 -1.2 -2.56
          curveToRelative(
            dx1 = -0.66f,
            dy1 = -0.72f,
            dx2 = -1.43f,
            dy2 = -1.83f,
            dx3 = -1.2f,
            dy3 = -2.56f,
          )
          // M 15.43 15
          moveTo(x = 15.43f, y = 15.0f)
          // a 2.44 2.44 0 0 1 -2.4 -2.15
          arcToRelative(
            a = 2.44f,
            b = 2.44f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.4f,
            dy1 = -2.15f,
          )
          // a 2.8 2.8 0 0 1 1.82 -3.03
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.82f,
            dy1 = -3.03f,
          )
          // l 3.3 4.18
          lineToRelative(dx = 3.3f, dy = 4.18f)
          // a 4 4 0 0 1 -2.72 1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.72f,
            dy1 = 1.0f,
          )
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
      .also { _categoryAnd = it }
  }

@Suppress("ObjectPropertyName")
private var _categoryAnd: ImageVector? = null
