// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BaseDocumentSet: ImageVector
  get() {
    val current = _baseDocumentSet
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BaseDocumentSet",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 30 c-3.3 0 -6 -2.7 -6 -6 s2.7 -6 6 -6 6 2.7 6 6 -2.7 6 -6 6 m0 -10 c-2.2 0 -4 1.8 -4 4 s1.8 4 4 4 4 -1.8 4 -4 -1.8 -4 -4 -4 m-8 8 h-4 V4 h8 v6 a2 2 0 0 0 2 2 h6 v4 h2 v-6 c0 -.3 -.1 -.5 -.3 -.7 l-7 -7 A1 1 0 0 0 22 2 H12 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h4z m6 -23.6 5.6 5.6 H22z M4 7 H2 v20 h2z m4 -3 H6 v24 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 30
          moveTo(x = 24.0f, y = 30.0f)
          // c -3.3 0 -6 -2.7 -6 -6
          curveToRelative(
            dx1 = -3.3f,
            dy1 = 0.0f,
            dx2 = -6.0f,
            dy2 = -2.7f,
            dx3 = -6.0f,
            dy3 = -6.0f,
          )
          // s 2.7 -6 6 -6
          reflectiveCurveToRelative(
            dx1 = 2.7f,
            dy1 = -6.0f,
            dx2 = 6.0f,
            dy2 = -6.0f,
          )
          // s 6 2.7 6 6
          reflectiveCurveToRelative(
            dx1 = 6.0f,
            dy1 = 2.7f,
            dx2 = 6.0f,
            dy2 = 6.0f,
          )
          // s -2.7 6 -6 6
          reflectiveCurveToRelative(
            dx1 = -2.7f,
            dy1 = 6.0f,
            dx2 = -6.0f,
            dy2 = 6.0f,
          )
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // c -2.2 0 -4 1.8 -4 4
          curveToRelative(
            dx1 = -2.2f,
            dy1 = 0.0f,
            dx2 = -4.0f,
            dy2 = 1.8f,
            dx3 = -4.0f,
            dy3 = 4.0f,
          )
          // s 1.8 4 4 4
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = 4.0f,
            dx2 = 4.0f,
            dy2 = 4.0f,
          )
          // s 4 -1.8 4 -4
          reflectiveCurveToRelative(
            dx1 = 4.0f,
            dy1 = -1.8f,
            dx2 = 4.0f,
            dy2 = -4.0f,
          )
          // s -1.8 -4 -4 -4
          reflectiveCurveToRelative(
            dx1 = -1.8f,
            dy1 = -4.0f,
            dx2 = -4.0f,
            dy2 = -4.0f,
          )
          // m -8 8
          moveToRelative(dx = -8.0f, dy = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // c 0 -0.3 -0.1 -0.5 -0.3 -0.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.3f,
            dy3 = -0.7f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 22 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 2.0f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 6 -23.6
          moveToRelative(dx = 6.0f, dy = -23.6f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
          // H 22z
          horizontalLineTo(x = 22.0f)
          close()
          // M 4 7
          moveTo(x = 4.0f, y = 7.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 4 -3
          moveToRelative(dx = 4.0f, dy = -3.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _baseDocumentSet = it }
  }

@Suppress("ObjectPropertyName")
private var _baseDocumentSet: ImageVector? = null
