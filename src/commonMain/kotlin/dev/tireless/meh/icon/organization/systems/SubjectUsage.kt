// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SubjectUsage: ImageVector
  get() {
    val current = _subjectUsage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SubjectUsage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.77 20.5 H22.7 c-.31 .9 -1.03 1.7 -2.52 1.7 -1.84 0 -2.87 -1.27 -2.87 -3.5 V13 h2.2 v5.47 c0 1.24 .47 1.91 1.52 1.91 .88 0 1.75 -.46 1.75 -1.43 v-5.94 h2.21 v9 h-2.2z M6.62 20.2 l1.53 -1.47 a4 4 0 0 0 3.09 1.48 c1.4 0 2.12 -.67 2.12 -1.69 0 -.8 -.38 -1.3 -1.64 -1.53 l-1.14 -.17 c-2.43 -.38 -3.6 -1.54 -3.6 -3.5 0 -2.15 1.67 -3.55 4.36 -3.55 1.8 0 3.15 .62 4.12 1.77 l-1.55 1.47 a3.2 3.2 0 0 0 -2.7 -1.24 c-1.28 0 -1.95 .51 -1.95 1.41 0 .91 .51 1.3 1.67 1.5 l1.12 .2 c2.42 .44 3.56 1.52 3.56 3.5 0 2.28 -1.63 3.83 -4.51 3.83 a5.6 5.6 0 0 1 -4.48 -2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.77 20.5
          moveTo(x = 22.77f, y = 20.5f)
          // H 22.7
          horizontalLineTo(x = 22.7f)
          // c -0.31 0.9 -1.03 1.7 -2.52 1.7
          curveToRelative(
            dx1 = -0.31f,
            dy1 = 0.9f,
            dx2 = -1.03f,
            dy2 = 1.7f,
            dx3 = -2.52f,
            dy3 = 1.7f,
          )
          // c -1.84 0 -2.87 -1.27 -2.87 -3.5
          curveToRelative(
            dx1 = -1.84f,
            dy1 = 0.0f,
            dx2 = -2.87f,
            dy2 = -1.27f,
            dx3 = -2.87f,
            dy3 = -3.5f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // h 2.2
          horizontalLineToRelative(dx = 2.2f)
          // v 5.47
          verticalLineToRelative(dy = 5.47f)
          // c 0 1.24 0.47 1.91 1.52 1.91
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.24f,
            dx2 = 0.47f,
            dy2 = 1.91f,
            dx3 = 1.52f,
            dy3 = 1.91f,
          )
          // c 0.88 0 1.75 -0.46 1.75 -1.43
          curveToRelative(
            dx1 = 0.88f,
            dy1 = 0.0f,
            dx2 = 1.75f,
            dy2 = -0.46f,
            dx3 = 1.75f,
            dy3 = -1.43f,
          )
          // v -5.94
          verticalLineToRelative(dy = -5.94f)
          // h 2.21
          horizontalLineToRelative(dx = 2.21f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2.2z
          horizontalLineToRelative(dx = -2.2f)
          close()
          // M 6.62 20.2
          moveTo(x = 6.62f, y = 20.2f)
          // l 1.53 -1.47
          lineToRelative(dx = 1.53f, dy = -1.47f)
          // a 4 4 0 0 0 3.09 1.48
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.09f,
            dy1 = 1.48f,
          )
          // c 1.4 0 2.12 -0.67 2.12 -1.69
          curveToRelative(
            dx1 = 1.4f,
            dy1 = 0.0f,
            dx2 = 2.12f,
            dy2 = -0.67f,
            dx3 = 2.12f,
            dy3 = -1.69f,
          )
          // c 0 -0.8 -0.38 -1.3 -1.64 -1.53
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.8f,
            dx2 = -0.38f,
            dy2 = -1.3f,
            dx3 = -1.64f,
            dy3 = -1.53f,
          )
          // l -1.14 -0.17
          lineToRelative(dx = -1.14f, dy = -0.17f)
          // c -2.43 -0.38 -3.6 -1.54 -3.6 -3.5
          curveToRelative(
            dx1 = -2.43f,
            dy1 = -0.38f,
            dx2 = -3.6f,
            dy2 = -1.54f,
            dx3 = -3.6f,
            dy3 = -3.5f,
          )
          // c 0 -2.15 1.67 -3.55 4.36 -3.55
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.15f,
            dx2 = 1.67f,
            dy2 = -3.55f,
            dx3 = 4.36f,
            dy3 = -3.55f,
          )
          // c 1.8 0 3.15 0.62 4.12 1.77
          curveToRelative(
            dx1 = 1.8f,
            dy1 = 0.0f,
            dx2 = 3.15f,
            dy2 = 0.62f,
            dx3 = 4.12f,
            dy3 = 1.77f,
          )
          // l -1.55 1.47
          lineToRelative(dx = -1.55f, dy = 1.47f)
          // a 3.2 3.2 0 0 0 -2.7 -1.24
          arcToRelative(
            a = 3.2f,
            b = 3.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.7f,
            dy1 = -1.24f,
          )
          // c -1.28 0 -1.95 0.51 -1.95 1.41
          curveToRelative(
            dx1 = -1.28f,
            dy1 = 0.0f,
            dx2 = -1.95f,
            dy2 = 0.51f,
            dx3 = -1.95f,
            dy3 = 1.41f,
          )
          // c 0 0.91 0.51 1.3 1.67 1.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.91f,
            dx2 = 0.51f,
            dy2 = 1.3f,
            dx3 = 1.67f,
            dy3 = 1.5f,
          )
          // l 1.12 0.2
          lineToRelative(dx = 1.12f, dy = 0.2f)
          // c 2.42 0.44 3.56 1.52 3.56 3.5
          curveToRelative(
            dx1 = 2.42f,
            dy1 = 0.44f,
            dx2 = 3.56f,
            dy2 = 1.52f,
            dx3 = 3.56f,
            dy3 = 3.5f,
          )
          // c 0 2.28 -1.63 3.83 -4.51 3.83
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.28f,
            dx2 = -1.63f,
            dy2 = 3.83f,
            dx3 = -4.51f,
            dy3 = 3.83f,
          )
          // a 5.6 5.6 0 0 1 -4.48 -2
          arcToRelative(
            a = 5.6f,
            b = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.48f,
            dy1 = -2.0f,
          )
        }
        // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -4.96 0 -9 -4.04 -9 -9
          curveToRelative(
            dx1 = -4.96f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.04f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -4.96 4.04 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.96f,
            dx2 = 4.04f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 4.96 0 9 4.04 9 9
          curveToRelative(
            dx1 = 4.96f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = 4.04f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 4.96 -4.04 9 -9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.96f,
            dx2 = -4.04f,
            dy2 = 9.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // M 11 4
          moveTo(x = 11.0f, y = 4.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 7 7 0 0 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 0 0 -7 -7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _subjectUsage = it }
  }

@Suppress("ObjectPropertyName")
private var _subjectUsage: ImageVector? = null
