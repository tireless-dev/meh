// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KubernetesPod: ImageVector
  get() {
    val current = _kubernetesPod
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KubernetesPod",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m22.5 11.64 -5.98 -3.5 a1 1 0 0 0 -1.01 0 l-6.01 3.5 A1 1 0 0 0 9 12.5 v7 a1 1 0 0 0 .5 .86 l6 3.5 A1 1 0 0 0 16 24 a1 1 0 0 0 .52 -.14 l5.98 -3.5 A1 1 0 0 0 23 19.5 v-7 a1 1 0 0 0 -.5 -.86 m-6.49 -1.48 4 2.34 -4 2.34 L12 12.5z M11 14.24 l4 2.33 v4.68 l-4 -2.33z m6 7.02 v-4.68 l4 -2.34 v4.69z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 11.64
          moveTo(x = 22.5f, y = 11.64f)
          // l -5.98 -3.5
          lineToRelative(dx = -5.98f, dy = -3.5f)
          // a 1 1 0 0 0 -1.01 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.01f,
            dy1 = 0.0f,
          )
          // l -6.01 3.5
          lineToRelative(dx = -6.01f, dy = 3.5f)
          // A 1 1 0 0 0 9 12.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 12.5f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 1 1 0 0 0 0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = 0.86f,
          )
          // l 6 3.5
          lineToRelative(dx = 6.0f, dy = 3.5f)
          // A 1 1 0 0 0 16 24
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 24.0f,
          )
          // a 1 1 0 0 0 0.52 -0.14
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.52f,
            dy1 = -0.14f,
          )
          // l 5.98 -3.5
          lineToRelative(dx = 5.98f, dy = -3.5f)
          // A 1 1 0 0 0 23 19.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 19.5f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.86f,
          )
          // m -6.49 -1.48
          moveToRelative(dx = -6.49f, dy = -1.48f)
          // l 4 2.34
          lineToRelative(dx = 4.0f, dy = 2.34f)
          // l -4 2.34
          lineToRelative(dx = -4.0f, dy = 2.34f)
          // L 12 12.5z
          lineTo(x = 12.0f, y = 12.5f)
          close()
          // M 11 14.24
          moveTo(x = 11.0f, y = 14.24f)
          // l 4 2.33
          lineToRelative(dx = 4.0f, dy = 2.33f)
          // v 4.68
          verticalLineToRelative(dy = 4.68f)
          // l -4 -2.33z
          lineToRelative(dx = -4.0f, dy = -2.33f)
          close()
          // m 6 7.02
          moveToRelative(dx = 6.0f, dy = 7.02f)
          // v -4.68
          verticalLineToRelative(dy = -4.68f)
          // l 4 -2.34
          lineToRelative(dx = 4.0f, dy = -2.34f)
          // v 4.69z
          verticalLineToRelative(dy = 4.69f)
          close()
        }
        // M16 31 a1 1 0 0 1 -.5 -.14 l-12 -7 A1 1 0 0 1 3 23 V9 a1 1 0 0 1 .5 -.86 l12 -7 a1 1 0 0 1 1 0 l11 6.41 -1 1.73 L16 3.16 5 9.57 v12.86 l11 6.41 11 -6.41 V15 h2 v8 a1 1 0 0 1 -.5 .86 l-12 7 A1 1 0 0 1 16 31
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 31
          moveTo(x = 16.0f, y = 31.0f)
          // a 1 1 0 0 1 -0.5 -0.14
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -0.14f,
          )
          // l -12 -7
          lineToRelative(dx = -12.0f, dy = -7.0f)
          // A 1 1 0 0 1 3 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 23.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 1 0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = -0.86f,
          )
          // l 12 -7
          lineToRelative(dx = 12.0f, dy = -7.0f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 11 6.41
          lineToRelative(dx = 11.0f, dy = 6.41f)
          // l -1 1.73
          lineToRelative(dx = -1.0f, dy = 1.73f)
          // L 16 3.16
          lineTo(x = 16.0f, y = 3.16f)
          // L 5 9.57
          lineTo(x = 5.0f, y = 9.57f)
          // v 12.86
          verticalLineToRelative(dy = 12.86f)
          // l 11 6.41
          lineToRelative(dx = 11.0f, dy = 6.41f)
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // V 15
          verticalLineTo(y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 1 1 0 0 1 -0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.86f,
          )
          // l -12 7
          lineToRelative(dx = -12.0f, dy = 7.0f)
          // A 1 1 0 0 1 16 31
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 31.0f,
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
      .also { _kubernetesPod = it }
  }

@Suppress("ObjectPropertyName")
private var _kubernetesPod: ImageVector? = null
